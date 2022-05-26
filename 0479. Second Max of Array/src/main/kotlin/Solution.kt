/*
class Solution {
    fun secondMax(nums: IntArray): Int = nums.sorted()[nums.lastIndex - 1]
}*/

class Solution {
    fun secondMax(nums: IntArray): Int {
        var prevMax = minOf(nums[0], nums[1])
        var currMax = maxOf(nums[0], nums[1])

        for (x in nums.drop(2)) {
            if (x >= currMax) {
                prevMax = currMax
                currMax = x
            }
        }
        return prevMax
    }
}
