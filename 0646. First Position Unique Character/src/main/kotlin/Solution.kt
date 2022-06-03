class Solution {
    fun firstUniqChar(s: String): Int {
        val freqMap = s.groupingBy { it }.eachCount()

        for ((i, c) in s.withIndex())
            if (freqMap[c] == 1)
                return i

        return -1
    }
}