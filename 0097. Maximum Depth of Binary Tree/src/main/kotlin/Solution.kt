import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/*
class Solution {
    fun maxDepth(root: TreeNode?): Int =
        if (root == null) 0
        else 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
}*/

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0

        var depth = 0
        val queue = LinkedList<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            depth++

            repeat(queue.size) {
                val node = queue.pop()
                if (node?.left != null) queue.offer(node.left)
                if (node?.right != null) queue.offer(node.right)
            }
        }
        return depth
    }
}

