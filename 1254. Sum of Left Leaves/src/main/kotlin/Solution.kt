/*
import java.util.LinkedList

class Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        if (root == null) return 0

        var sum = 0
        val queue = LinkedList<TreeNode>()
        queue.offer(root)

        while (queue.isNotEmpty()) {

            val node = queue.poll()

            if (node.left != null) {

                if (isLeafNode(node.left!!))
                    sum += node.left!!.`val`

                queue.offer(node.left)
            }
            if (node.right != null)
                queue.offer(node.right)
        }

        return sum
    }

    private fun isLeafNode(node: TreeNode): Boolean {
        return node.left == null && node.right == null
    }
}*/

/*
class Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        return sumOfLeftLeaves(root, false)
    }

    private fun sumOfLeftLeaves(node: TreeNode?, isLeft: Boolean): Int {
        if (node == null) return 0

        if (isLeft && node.left == null && node.right == null) return node.`val`

        return sumOfLeftLeaves(node.left, true) + sumOfLeftLeaves(node.right, false)
    }
}
*/

class Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        if (root == null) return 0

        var sum = 0

        if (root.left != null && root.left!!.left == null && root.left!!.right == null)
            sum = root.left!!.`val`

        sum += sumOfLeftLeaves(root.left)
        sum += sumOfLeftLeaves(root.right)

        return sum
    }
}
