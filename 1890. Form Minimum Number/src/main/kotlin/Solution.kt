class Solution {
    fun formMinimumNumber(str: String): String {
        val sb = StringBuilder()
        var pos = 0
        var num = 1

        for (c in "_$str") {
            if (c == 'I')
                pos = sb.length
            sb.insert(pos, num++)
        }

        return sb.toString()
    }
}