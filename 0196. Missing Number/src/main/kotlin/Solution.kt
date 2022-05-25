class Solution {
    fun findMissing(nums: IntArray): Int {
        val n = nums.size

        return n * (n + 1) / 2 - nums.sum()
    }
}