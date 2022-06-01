import kotlin.collections.ArrayDeque

/*
class Solution {
    fun binaryTreePathSum(root: TreeNode?, target: Int): List<IntArray> {
        return binaryTreePaths(root)
            .filter { it.sum() == target }
            .map { it.toIntArray() }
    }

    private fun binaryTreePaths(root: TreeNode?): List<MutableList<Int>> {
        val paths = mutableListOf<MutableList<Int>>()

        if (root == null) return paths

        if (root.left == null && root.right == null) {
            paths.add(mutableListOf(root.`val`))
            return paths
        }

        binaryTreePaths(root.left).forEach {
            val path = mutableListOf(root.`val`)
            path.addAll(it)
            paths.add(path)
        }

        binaryTreePaths(root.right).forEach {
            val path = mutableListOf(root.`val`)
            path.addAll(it)
            paths.add(path)
        }

        return paths
    }
}*/

class Solution {
    fun binaryTreePathSum(root: TreeNode?, target: Int): List<IntArray> {
        val res = mutableListOf<MutableList<Int>>()

        if (root == null) return listOf()

        val path = ArrayDeque<Int>()
        dfs(root, target, path, res)

        return res.map { it.toIntArray() }
    }

    private fun dfs(root: TreeNode?, target: Int, path: ArrayDeque<Int>, res: MutableList<MutableList<Int>>) {
        if (root == null) return

        path.addLast(root.`val`)

        if (root.left == null && root.right == null) {

            if (target == root.`val`) {

                val list = mutableListOf<Int>()
                list.addAll(path)
                res.add(list)
            }

            path.removeLast()
            return
        }

        dfs(root.left, target - root.`val`, path, res)
        dfs(root.right, target - root.`val`, path, res)

        path.removeLast()
    }
}
