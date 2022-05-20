class Solution {
    fun recoverRotatedSortedArray(nums: MutableList<Int>): Unit {
        val k = findReversePoint(nums)

        if (k < 0) return

        reverse(nums, 0, k)
        reverse(nums, k + 1, nums.size - 1)
        reverse(nums, 0, nums.size - 1)
    }

    private fun reverse(nums: MutableList<Int>, start: Int, end: Int): Unit {
        var left = start
        var right = end

        while (left <= right)
            nums[left] = nums[right]
                .also { nums[right--] = nums[left++] }
    }

    private fun findReversePoint(nums: List<Int>): Int {
        for (i in nums.indices.drop(1))
            if (nums[i - 1] > nums[i])
                return i - 1

        return -1
    }
}