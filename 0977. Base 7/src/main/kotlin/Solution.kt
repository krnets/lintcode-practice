class Solution {
    fun convertToBase7(num: Int): String {
        val baseChars = (0..6).toList()
        val sb = StringBuilder()
        var m = Math.abs(num)

        while (m != 0) {
            sb.append(baseChars[m % 7])
            m /= 7
        }

        val ans = sb.reversed()

        return if (num < 0) "-$ans" else "$ans"
    }
}