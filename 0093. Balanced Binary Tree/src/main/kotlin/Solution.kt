class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true

        return Math.abs(getTreeHeight(root.left) - getTreeHeight(root.right)) <= 1 &&
                isBalanced(root.left) && isBalanced(root.right)
    }

    private fun getTreeHeight(node: TreeNode?): Int {
        if (node == null) return 0

        return 1 + maxOf(getTreeHeight(node.left), getTreeHeight(node.right))
    }
}