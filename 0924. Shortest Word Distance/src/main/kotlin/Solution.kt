/*
class Solution {
    fun shortestDistance(words: Array<String>, word1: String, word2: String): Int {
        val distances = mutableListOf<Int>()

        for (i in 0 until words.lastIndex) {
            for (j in i + 1 until words.size) {
                if (words[i] == word1 && words[j] == word2 ||
                    words[i] == word2 && words[j] == word1
                ) {
                    distances.add(j - i)
                    break
                }
            }
        }

        return distances.minOf { it }
    }
}*/

class Solution {
    fun shortestDistance(words: Array<String>, word1: String, word2: String): Int {
        var ans = Int.MAX_VALUE
        var pos1 = words.size
        var pos2 = Int.MAX_VALUE

        for (i in words.indices) {
            if (words[i] == word1) pos1 = i
            if (words[i] == word2) pos2 = i

            ans = minOf(ans, Math.abs(pos2 - pos1))
        }

        return ans
    }
}
