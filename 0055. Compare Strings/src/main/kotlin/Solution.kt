/*
class Solution {
    fun compareStrings(a: String, b: String): Boolean {
        val freqMapA = a.groupingBy { it }.eachCount()
        val freqMapB = b.groupingBy { it }.eachCount()

        for ((key, countInB) in freqMapB)
            if (!freqMapA.containsKey(key) || freqMapA[key]!! < countInB)
                return false

        return true
    }
}*/

class Solution {
    fun compareStrings(a: String, b: String): Boolean {
        val charCount = IntArray(26)

        for (c in a) {
            charCount['Z' - c]++
        }

        for (c in b) {
            if (charCount['Z' - c] == 0)
                return false

            charCount['Z' - c]--
        }

        return true
    }
}