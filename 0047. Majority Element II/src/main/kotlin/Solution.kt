/*
class Solution {
    fun majorityNumber(nums: List<Int>): Int {
        var element1 = 0
        var element2 = 0

        var vote1 = 0
        var vote2 = 0

        for (x in nums) {
            if (vote1 > 0 && x == element1)
                vote1++
            else if (vote2 > 0 && x == element2)
                vote2++
            else if (vote1 == 0) {
                element1 = x
                vote1++
            } else if (vote2 == 0) {
                element2 = x
                vote2++
            } else {
                vote1--
                vote2--
            }
        }

        var count1 = 0
        var count2 = 0

        for (x in nums) {
            if (vote1 > 0 && x == element1) count1++
            if (vote2 > 0 && x == element2) count2++
        }

        if (vote1 > 0 && count1 > nums.size / 3) return element1
        if (vote2 > 0 && count2 > nums.size / 3) return element2

        return -1
    }
}*/

class Solution {
    fun majorityNumber(nums: List<Int>): Int {
        var element1 = 0
        var element2 = 0

        var vote1 = 0
        var vote2 = 0

        for (x in nums) {
            if (vote1 == 0) {
                element1 = x
                vote1++
            } else if (vote1 > 0 && x == element1) vote1++
            else if (vote2 == 0) {
                element2 = x
                vote2++
            } else if (vote2 > 0 && x == element2) vote2++
            else {
                vote1--
                vote2--
            }
        }

        var count1 = 0
        var count2 = 0

        for (x in nums) {
            if (vote1 > 0 && x == element1) count1++
            if (vote2 > 0 && x == element2) count2++
        }

        if (vote1 > 0 && count1 > nums.size / 3) return element1
        if (vote2 > 0 && count2 > nums.size / 3) return element2

        return -1
    }
}
