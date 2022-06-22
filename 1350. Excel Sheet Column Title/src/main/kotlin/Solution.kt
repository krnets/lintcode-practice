class Solution {
    fun convertToTitle(n: Int): String {
        val sb = StringBuilder()
        var m = n

        while (m > 0) {
            m--
            sb.insert(0, 'A' + m % 26)
            m /= 26
        }

        return sb.toString()
    }
}