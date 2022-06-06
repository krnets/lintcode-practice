class Solution {
    fun generatePossibleNextMoves(s: String): List<String> {
        val result = mutableListOf<String>()

        for (i in s.indices.drop(1)) {

            if (s[i] == '+' && s[i - 1] == '+') {
                val chars = s.toCharArray()
                chars[i] = '-'
                chars[i - 1] = '-'
                result.add(chars.joinToString(""))
            }
        }

        return result
    }
}