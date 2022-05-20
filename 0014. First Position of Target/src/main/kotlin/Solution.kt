/*
class Solution {
    fun binarySearch(nums: IntArray, target: Int): Int {
        val n = nums.size
        var start = 0
        var end = n

        while (start <= end) {
            var mid = start + (end - start) / 2

            if (nums[mid] == target) {

                while (mid >= 0 && nums[mid] == target)
                    mid--

                return mid + 1
            }

            if (nums[mid] > target)
                end = mid - 1
            else if (nums[mid] < target)
                start = mid + 1
        }

        return -1
    }
}*/

class Solution {
    fun binarySearch(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (nums[mid] >= target)
                high = mid - 1
            else if (nums[mid] < target)
                low = mid + 1
        }

        return if (nums[low] == target) low else -1
    }
}
