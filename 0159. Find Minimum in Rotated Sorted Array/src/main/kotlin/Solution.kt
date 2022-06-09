/*
class Solution {
    fun findMin(nums: IntArray): Int {
        val first = nums.first()

        for (x in nums.drop(1))
            if (x < first)
                return x

        return first
    }
}*/

class Solution {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val mid = left + (right - left) / 2

            if (nums[mid] > nums[right])
                left = mid + 1
            else right = mid
        }

        return nums[left]
    }
}
