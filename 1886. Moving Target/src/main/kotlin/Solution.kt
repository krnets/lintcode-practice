class Solution {
    fun moveTarget(nums: IntArray, target: Int): Unit {
        var left = nums.lastIndex

        for (right in nums.indices.reversed()) {

            if (nums[right] != target) {

                nums[left] = nums[right]
                    .also { nums[right] = nums[left] }

                left--
            }
        }
    }
}