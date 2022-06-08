/*
class Solution {
    fun partitionArray(nums: IntArray, k: Int): Int {
        return nums.count { it < k }
    }
}
*/

class Solution {
    fun partitionArray(nums: IntArray, k: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {

            while (left < right && nums[left] < k)
                left++

            while (left <= right && nums[right] >= k)
                right--

            if (left <= right) {
                nums[left] = nums[right].also {
                    nums[right] = nums[left]
                }
                left++
                right--
            }
        }

        return left
    }
}
