/*
class Solution {
    fun majorityNumber(nums: List<Int>): Int =
        nums.groupingBy { it }
            .eachCount()
            .maxByOrNull { it.value > nums.size / 2 }!!
            .key
}*/

class Solution {
    fun majorityNumber(nums: List<Int>): Int {
        var majorityElement = 0
        var count = 0

        for (x in nums) {
            if (count == 0)
                majorityElement = x
            if (x == majorityElement)
                count++
            else
                count--
        }

        return majorityElement
    }
}
