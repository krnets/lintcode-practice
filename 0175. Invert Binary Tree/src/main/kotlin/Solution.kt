import java.util.*

/*
class Solution {
    fun invertBinaryTree(root: TreeNode?): Unit {

        if (root != null) {

            invertBinaryTree(root.left)
            invertBinaryTree(root.right)

            root.left = root.right.also {
                root.right = root.left
            }
        }
    }
}*/

class Solution {
    fun invertBinaryTree(root: TreeNode?): Unit {
        val stack = Stack<TreeNode?>()
        stack.push(root)

        while (stack.isNotEmpty()) {
            val node = stack.pop()

            if (node != null) {
                stack.push(node.left)
                stack.push(node.right)

                node.left = node.right.also {
                    node.right = node.left
                }
            }
        }
    }
}
