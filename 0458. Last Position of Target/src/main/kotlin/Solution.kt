class Solution {
    fun lastPosition(nums: IntArray, target: Int): Int {
        if (nums.isEmpty() || target < nums.first() || target > nums.last())
            return -1

        var low = 0
        var high = nums.size - 1

        while (low < high) {
            val mid = (low + high + 1) / 2

            if (nums[mid] < target)
                low = mid + 1
            else if (nums[mid] == target) {
                low = mid
            } else
                high = mid - 1
        }

        return if (nums[low] == target) low else -1
    }
}