class Solution {
    fun isPalindrome(s: String): Boolean {
        val freqMap = s.groupingBy { it }.eachCount()

        return if (s.length % 2 == 0)
            freqMap.all { it.value % 2 == 0 }
        else freqMap.count { it.value % 2 == 1 } == 1
    }
}