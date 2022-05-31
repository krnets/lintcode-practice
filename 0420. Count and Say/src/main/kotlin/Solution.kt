/*
class Solution {
    fun countAndSay(n: Int): String {
        var str = "1"
        val sb = StringBuilder()

        repeat(n - 1) {
            var prev = str.first()
            var count = 1

            for (c in str.drop(1)) {
                if (c == prev) {
                    count++
                } else {
                    sb.append(count)
                    sb.append(prev)
                    prev = c
                    count = 1
                }
            }
            sb.append(count)
            sb.append(prev)
            str = sb.toString()
            sb.clear()
        }

        return str
    }
}
*/

class Solution {
    fun countAndSay(n: Int): String {
        val pattern = Regex("(.)\\1*")
        var str = "1"

        repeat(n - 1) {
            str = pattern.findAll(str)
                .map { it.value }
                .joinToString("") { "${it.length}${it.first()}" }
        }

        return str
    }
}
