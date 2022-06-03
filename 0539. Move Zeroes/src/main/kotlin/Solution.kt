class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var left = 0

        for (right in nums.indices) {
            if (nums[right] != 0) {

                nums[left] = nums[right].also {
                    nums[right] = nums[left]
                }

                left++
            }
        }
    }
}