class Solution {
    fun isTweakedIdentical(a: TreeNode?, b: TreeNode?): Boolean {
        if (a == b) return true
        if (a == null || b == null || a.`val` != b.`val`) return false

        return isTweakedIdentical(a.left, b.left) && isTweakedIdentical(a.right, b.right) ||
                isTweakedIdentical(a.left, b.right) && isTweakedIdentical(a.right, b.left)
    }
}