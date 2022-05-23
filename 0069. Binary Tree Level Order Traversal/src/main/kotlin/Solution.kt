class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

// BFS
/*
class Solution {
    fun levelOrder(root: TreeNode?): List<IntArray> {
        val list = mutableListOf<List<Int>>()

        val queue = LinkedList<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val level = mutableListOf<Int>()

            repeat(queue.size) {
                val node = queue.poll()
                level.add(node.`val`)

                if (node.left != null) queue.offer(node.left)
                if (node.right != null) queue.offer(node.right)
            }

            list.add(level)
        }

        return list.map { it.toIntArray() }
    }
}*/

// DFS
class Solution {
    fun levelOrder(root: TreeNode?): List<IntArray> {
        val list = mutableListOf<List<Int>>()
        var targetLevel = 0

        while (true) {
            val levelList = mutableListOf<Int>()

            dfs(root, 0, targetLevel, levelList)

            if (levelList.isEmpty())
                break

            list.add(levelList)
            targetLevel++
        }

        return list.map { it.toIntArray() }
    }

    private fun dfs(root: TreeNode?, currentLevel: Int, targetLevel: Int, levelList: MutableList<Int>) {
        if (root == null || currentLevel > targetLevel)
            return

        if (currentLevel == targetLevel)
            levelList.add(root.`val`)

        dfs(root.left, currentLevel + 1, targetLevel, levelList)

        dfs(root.right, currentLevel + 1, targetLevel, levelList)
    }
}
