class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = intArrayOf(-1, -1)

        for (i in 0 until nums.lastIndex) {

            val idx = binarySearch(nums, target - nums[i], i + 1, nums.size - 1)

            if (idx > 0) {
                result[0] = i + 1
                result[1] = idx + 1
                break
            }
        }

        return result
    }

    private fun binarySearch(nums: IntArray, x: Int, from: Int, to: Int): Int {
        var low = from
        var high = to

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (x < nums[mid])
                high = mid - 1
            else if (x > nums[mid])
                low = mid + 1
            else
                return mid
        }

        return -1
    }
}
