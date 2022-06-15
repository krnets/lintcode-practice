class Solution {
    fun findWords(str: String, dict: List<String>): List<String> {
        return dict.filter { isSubsequence(it, str) }.toList()
    }

    private fun isSubsequence(word: String, str: String): Boolean {
        var pos = 0

        for (c in str)
            if (c == word[pos]) {
                pos++
                if (pos == word.length) break
            }

        return pos == word.length
    }
}