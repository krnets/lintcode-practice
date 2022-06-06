/*
class Solution {
    fun capitalizesFirst(s: String): String {
        return s.split(" ").joinToString(" ") { it.capitalize() }
    }
}*/

/*
class Solution {
    fun capitalizesFirst(s: String): String {
        val chars = s.toCharArray()
        chars[0] = chars[0].toUpperCase()

        for (i in chars.indices.drop(1)) {
            if (chars[i - 1] == ' ') {
                chars[i] = chars[i].toUpperCase()
            }
        }

        return chars.joinToString("")
    }
}
*/

class Solution {
    fun capitalizesFirst(s: String): String {
        val sb = StringBuilder()
        var prevChar = s.first().toUpperCase()
        sb.append(prevChar)

        for (c in s.drop(1)) {

            if (prevChar == ' ') {
                sb.append(c.toUpperCase())
            } else sb.append(c)

            prevChar = c
        }

        return "$sb"
    }
}
