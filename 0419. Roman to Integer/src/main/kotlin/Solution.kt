class Solution {
    fun romanToInt(s: String): Int {
        val roman = mapOf(
            "M" to 1000, "CM" to 900, "D" to 500, "CD" to 400, "C" to 100, "XC" to 90,
            "L" to 50, "XL" to 40, "X" to 10, "IX" to 9, "V" to 5, "IV" to 4, "I" to 1
        )
        var ans = 0
        var i = 0

        while (i < s.length) {
            val nextTwo = s.drop(i).take(2)

            if (nextTwo in roman) {
                ans += roman[nextTwo]!!
                i++
            } else {
                val c = s.drop(i).take(1)
                ans += roman[c]!!
            }
            i++
        }

        return ans
    }
}