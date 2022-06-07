class Solution {
    private val list = mutableListOf<Int>()

    fun searchRange(root: TreeNode?, k1: Int, k2: Int): List<Int> {
        dfs(root, k1, k2)
        return list
    }

    private fun dfs(root: TreeNode?, k1: Int, k2: Int) {
        if (root == null) return
        if (root.`val` > k1) dfs(root.left, k1, k2)
        if (root.`val` in k1..k2) list.add(root.`val`)
        if (root.`val` < k2) dfs(root.right, k1, k2)
    }
}