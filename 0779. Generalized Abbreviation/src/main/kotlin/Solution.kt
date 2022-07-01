/*
class Solution {
    private val list = mutableListOf<String>()

    fun generateAbbreviations(word: String): List<String> {

        dfsBacktrack(word, 0, "", 0)

        return list
    }

    private fun dfsBacktrack(word: String, pos: Int, current: String, count: Int) {
        var current = current

        if (pos == word.length) {
            if (count > 0)
                current += count.toString()
            list.add(current)
        } else {

            dfsBacktrack(word, pos + 1, current, count + 1)

            if (count > 0)
                current += count.toString() + word[pos]
            else current += word[pos]

            dfsBacktrack(word, pos + 1, current, 0)
        }
    }
}
*/

class Solution {
    private val list = mutableListOf<String>()

    fun generateAbbreviations(word: String): List<String> {

        dfsBacktrack(word, StringBuilder(), 0, 0)

        return list
    }

    private fun dfsBacktrack(word: String, sb: StringBuilder, i: Int, count: Int) {
        if (i == word.length) {
            list.add(sb.toString())
        } else {
            sb.append(word[i])

            dfsBacktrack(word, sb, i + 1, 0)
            sb.deleteAt(sb.length - 1)
            removeTailDigits(sb)
            sb.append(count + 1)

            dfsBacktrack(word, sb, i + 1, count + 1)
            removeTailDigits(sb)
        }
    }

    private fun removeTailDigits(sb: StringBuilder) {
        while (sb.isNotEmpty() && sb[sb.length - 1].isDigit()) {
            sb.deleteAt(sb.length - 1)
        }
    }
}
