class Solution {
    fun decompressString(message: String): String {
        val to = message.indexOf(']')

        if (to < 0) return message

        val from = message.substring(0, to).lastIndexOf('[')
        val bar = from + message.drop(from).indexOf('|')
        val times = message.substring(from + 1, bar).toInt()
        val sub = message.substring(bar + 1, to)
        val inner = sub.repeat(times)
        val msg = message.substring(0, from) + inner + message.substring(to + 1)

        return decompressString(msg)
    }
}