class Solution {
    fun maxDiffSubArrays(nums: IntArray): Int {
        val n = nums.size

        val leftMaxDp = IntArray(n)
        val leftMinDp = IntArray(n)

        val rightMaxDp = IntArray(n)
        val rightMinDp = IntArray(n)

        leftMaxDp[0] = nums.first()
        leftMinDp[0] = nums.first()

        rightMaxDp[n - 1] = nums.last()
        rightMinDp[n - 1] = nums.last()

        for (i in nums.indices.drop(1)) {
            leftMaxDp[i] = maxOf(nums[i], leftMaxDp[i - 1] + nums[i])
            leftMinDp[i] = minOf(nums[i], leftMinDp[i - 1] + nums[i])
        }

        for (i in (n - 2).downTo(0)) {
            rightMaxDp[i] = maxOf(nums[i], rightMaxDp[i + 1] + nums[i])
            rightMinDp[i] = minOf(nums[i], rightMinDp[i + 1] + nums[i])
        }

        var maxDiff = Int.MIN_VALUE

        for (i in nums.indices.drop(1)) {
            maxDiff = maxOf(
                maxDiff,
                leftMaxDp[i - 1] - rightMinDp[i],
                rightMaxDp[i] - leftMinDp[i - 1]
            )
        }

        return maxDiff
    }
}