class Solution {
    fun largestNumber(nums: IntArray): String {
        val ans = nums.map { "$it" }
            .sortedWith { a, b -> (b + a).compareTo(a + b) }
            .joinToString("")

        return if (ans.first() == '0') "0" else ans
    }
}
