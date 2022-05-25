import java.util.LinkedList

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

/*
class Solution {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        val leftDepth = minDepth(root.left)
        val rightDepth = minDepth(root.right)

        if (root.left != null && root.right != null)
            return minOf(leftDepth, rightDepth) + 1

        return maxOf(leftDepth, rightDepth) + 1
    }
}*/

class Solution {
    fun minDepth(root: TreeNode?): Int {
        if (root == null) return 0

        var depth = 0
        val queue = LinkedList<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            depth++

            repeat(queue.size) {
                val node = queue.poll()

                if (node.left == null && node.right == null) return depth
                if (node.left != null) queue.offer(node.left)
                if (node.right != null) queue.offer(node.right)
            }
        }

        return 0
    }
}
