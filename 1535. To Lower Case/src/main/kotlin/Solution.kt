/*
class Solution {
    fun toLowerCase(str: String): String {
        val sb = StringBuilder()

        for (c in str)
            sb.append(c.toLowerCase())

        return sb.toString()
    }
}*/

class Solution {
    fun toLowerCase(str: String): String {
        val sb = StringBuilder()

        for (c in str)
            if (c in 'A'..'Z')
                sb.append((c.toInt() + 32).toChar())
            else sb.append(c)

        return sb.toString()
    }
}
