/*
class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var sumOfPairMin = 0

        for (i in nums.indices step 2)
            sumOfPairMin += nums[i]

        return sumOfPairMin
    }
}*/

class Solution {
    fun arrayPairSum(nums: IntArray): Int = nums.sorted().chunked(2).sumOf { it.first() }
}
