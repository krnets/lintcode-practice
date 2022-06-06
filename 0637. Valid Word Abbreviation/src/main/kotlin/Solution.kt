class Solution {
    fun validWordAbbreviation(word: String, abbr: String): Boolean {
        val pattern = "(\\d+)|([a-z]+)".toRegex()
        val groups = pattern.findAll(abbr, 0).map { it.value }
        var pos = 0

        for (match in groups) {
            if (match.first() == '0')  return false

            if (match.first().isLetter()) {
                val sub = word.substring(pos, pos + match.length)

                if (match != sub) return false

                pos += match.length
            } else
                pos += match.toInt()
        }
        return pos == word.length
    }
}