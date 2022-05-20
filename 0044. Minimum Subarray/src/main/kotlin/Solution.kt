class Solution {
    fun minSubArray(nums: List<Int>): Int {
        if (nums.isEmpty()) return 0

        var prefixSum = 0
        var minSum = Int.MAX_VALUE
        var maxSum = 0

        for (x in nums) {
            prefixSum += x
            minSum = minOf(minSum, prefixSum - maxSum)
            maxSum = maxOf(maxSum, prefixSum)
        }

        return minSum
    }
}
