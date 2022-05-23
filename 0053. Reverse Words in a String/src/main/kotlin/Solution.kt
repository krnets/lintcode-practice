/*
class Solution {
    fun reverseWords(s: String): String = s
        .split(" ")
        .filterNot { it.isEmpty() }
        .reversed()
        .joinToString(" ")
}*/

/*
class Solution {
    fun reverseWords(s: String): String {
        val sb = StringBuilder()
        var wordStart: Int
        var wordEnd = s.length - 1

        while (wordEnd > 0) {

            while (wordEnd >= 0 && s[wordEnd] == ' ')
                wordEnd--

            wordStart = wordEnd

            while (wordStart >= 0 && s[wordStart] != ' ')
                wordStart--

            sb.append(s.substring(wordStart + 1, wordEnd + 1)).append(' ')

            wordEnd = wordStart
        }

        while (sb.isNotEmpty() && sb.last() == ' ')
            sb.deleteAt(sb.lastIndex)

        return sb.toString()
    }
}
*/

class Solution {
    fun reverseWords(s: String): String {
        val sb = StringBuilder()
        var wordStart: Int
        var wordEnd = s.length - 1

        while (wordEnd > 0) {

            while (wordEnd >= 0 && s[wordEnd] == ' ')
                wordEnd--

            wordStart = wordEnd

            while (wordStart >= 0 && s[wordStart] != ' ')
                wordStart--

            var pos = wordStart + 1

            while (pos <= wordEnd)
                sb.append(s[pos++])

            sb.append(' ')

            wordEnd = wordStart
        }

        while (sb.isNotEmpty() && sb.last() == ' ')
            sb.deleteAt(sb.lastIndex)

        return sb.toString()
    }
}
