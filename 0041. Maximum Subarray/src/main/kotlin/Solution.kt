class Solution {
    fun maxSubArray(nums: IntArray): Int {
        if (nums.isEmpty()) return 0

        var prefixSum = 0
        var maxSum = Int.MIN_VALUE
        var minSum = 0

        for (x in nums) {
            prefixSum += x
            maxSum = maxOf(maxSum, prefixSum - minSum)
            minSum = minOf(minSum, prefixSum)
        }

        return maxSum
    }
}