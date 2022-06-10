class Solution {
    fun intToRoman(n: Int): String {
        val sb = StringBuilder()
        val roman = listOf(
            1000 to "M", 900 to "CM", 500 to "D", 400 to "CD", 100 to "C", 90 to "XC",
            50 to "L", 40 to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I"
        )
        var m = n

        for (r in roman) {
            while (m >= r.first) {
                sb.append(r.second)
                m -= r.first
            }
        }

        return sb.toString()
    }
}