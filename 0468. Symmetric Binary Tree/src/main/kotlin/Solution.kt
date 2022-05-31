import java.util.*

/*
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        return root == null || isSymmetric(root.left, root.right)
    }

    fun isSymmetric(leftNode: TreeNode?, rightNode: TreeNode?): Boolean {
        if (leftNode == null || rightNode == null)
            return leftNode == rightNode

        if (leftNode.`val` != rightNode.`val`)
            return false

        return isSymmetric(leftNode.left, rightNode.right) &&
                isSymmetric(leftNode.right, rightNode.left)
    }
}*/

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true

        val stack = Stack<TreeNode?>()
        stack.push(root.left)
        stack.push(root.right)

        while (stack.isNotEmpty()) {
            val node1 = stack.pop()
            val node2 = stack.pop()

            if (node1 == null && node2 == null)
                continue

            if (node1?.`val` != node2?.`val`)
                return false

            stack.push(node1?.left)
            stack.push(node2?.right)
            stack.push(node1?.right)
            stack.push(node2?.left)
        }

        return true
    }
}
