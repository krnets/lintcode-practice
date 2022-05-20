class Solution {
    fun maxNum(nums: List<Int>): Int {
        var ans = Int.MIN_VALUE

        for (x in nums)
            if (x > ans)
                ans = x

        return ans
    }
}