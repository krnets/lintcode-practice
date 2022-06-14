class Solution {
    fun maxTwoSubArrays(nums: List<Int>): Int {
        val n = nums.size

        val prefixSum = IntArray(n)
        val prefixMax = IntArray(n)

        val suffixSum = IntArray(n)
        val suffixMax = IntArray(n)

        prefixSum[0] = nums.first()
        prefixMax[0] = nums.first()

        suffixSum[n - 1] = nums.last()
        suffixMax[n - 1] = nums.last()

        for (i in nums.indices.drop(1)) {
            prefixSum[i] = maxOf(prefixSum[i - 1] + nums[i], nums[i])
            prefixMax[i] = maxOf(prefixMax[i - 1], prefixSum[i])
        }

        for (i in (n - 2).downTo(0)) {
            suffixSum[i] = maxOf(suffixSum[i + 1] + nums[i], nums[i])
            suffixMax[i] = maxOf(suffixMax[i + 1], suffixSum[i])
        }

        var maxSumTwoArrays = Int.MIN_VALUE

        for (i in 0 until nums.lastIndex) {
            maxSumTwoArrays = maxOf(maxSumTwoArrays, prefixMax[i] + suffixMax[i + 1])
        }

        return maxSumTwoArrays
    }
}