/*
class Solution {
    fun mountainSequence(nums: IntArray): Int {
        return nums.maxOrNull() ?: 0
    }
}*/

/*
class Solution {
    fun mountainSequence(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left + 1 < right) {
            val mid = left + (right - left) / 2

            if (nums[mid] > nums[mid + 1])
                right = mid
            else left = mid
        }

        return maxOf(nums[left], nums[right])
    }
}
*/

class Solution {
    fun mountainSequence(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left + 1 < right) {
            val mid = left + (right - left) / 2

            if (nums[mid] > nums[mid + 1] && nums[mid - 1] < nums[mid])
                return nums[mid]

            if (nums[mid] < nums[mid + 1])
                left = mid + 1
            else right = mid - 1
        }

        return maxOf(nums[left], nums[right])
    }
}
