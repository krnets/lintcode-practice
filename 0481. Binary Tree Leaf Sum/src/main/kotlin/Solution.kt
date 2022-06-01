class Solution {
    fun leafSum(root: TreeNode?): Int {
        if (root == null) return 0
        if (root.left == null && root.right == null) return root.`val`

        return leafSum(root.left) + leafSum(root.right)
    }
}