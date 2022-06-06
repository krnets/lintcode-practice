class Solution {
    fun canPermutePalindrome(s: String): Boolean {
        val freqMap = s.groupingBy { it }.eachCount()

        return if (s.length % 2 == 0) freqMap.all { it.value % 2 == 0 } else (freqMap.values.count { it % 2 == 1 } == 1)
    }
}