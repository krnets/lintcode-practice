import java.util.*

/*
class Solution {
    private var lastNode: TreeNode? = null

    fun flatten(root: TreeNode?): Unit {
        if (root == null) return

        flatten(root.right)
        flatten(root.left)

        root.right = lastNode
        root.left = null

        lastNode = root
    }
}
*/

class Solution {
    fun flatten(root: TreeNode?): Unit {
        if (root == null) return

        val stack = Stack<TreeNode>()
        stack.push(root)
        var prev: TreeNode? = null

        while (stack.isNotEmpty()) {
            val curr = stack.pop()

            if (prev != null) {
                prev.left = null
                prev.right = curr
            }

            if (curr!!.right != null) stack.push(curr.right)
            if (curr.left != null) stack.push(curr.left)

            prev = curr
        }
    }
}
