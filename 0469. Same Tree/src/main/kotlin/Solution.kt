/*
class Solution {
    fun isIdentical(a: TreeNode?, b: TreeNode?): Boolean {
        if (a == null && b == null) return true

        if (a?.`val` == b?.`val`)
            return isIdentical(a!!.left, b!!.left) &&
                    isIdentical(a.right, b.right)

        return false
    }
}*/

class Solution {
    fun isIdentical(a: TreeNode?, b: TreeNode?): Boolean =
        (a == null && b == null) ||
                (a?.`val` == b?.`val`) &&
                isIdentical(a!!.left, b!!.left) &&
                isIdentical(a.right, b.right)
}
