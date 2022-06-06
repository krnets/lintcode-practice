class Solution {
    fun reverseArray(nums: IntArray): Unit {
        var left = 0
        var right = nums.lastIndex

        while(left < right) {
            nums[left]  = nums[right].also {
                nums[right] = nums[left]
            }
            left++
            right--
        }
    }
}