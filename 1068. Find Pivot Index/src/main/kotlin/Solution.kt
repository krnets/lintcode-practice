class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val sum = nums.sum()
        var curSum = 0

        for (i in nums.indices) {

            if (2 * curSum + nums[i] == sum) return i

            curSum += nums[i]
        }
        return -1
    }
}