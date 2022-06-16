/*
class Solution {

    private val mirrorDigit = mapOf(0 to 0, 1 to 1, 2 to 5, 5 to 2, 6 to 9, 8 to 8, 9 to 6)

    fun rotatedDigits(n: Int): Int =
        (1..n).count { isValidRotated(it) }

    private fun isValidRotated(n: Int): Boolean {

        if (n < 10) return (n in mirrorDigit && mirrorDigit[n] != n)

        var m = n
        val digits = StringBuilder()

        while (m > 0) {
            val x = m % 10

            if (x !in mirrorDigit) return false

            digits.append(mirrorDigit[x])
            m /= 10
        }

        return n != "${digits.reversed()}".toInt()
    }
}*/


class Solution {

    fun rotatedDigits(n: Int): Int = (1..n).count { isValidRotated(it) }

    private fun isValidRotated(n: Int): Boolean {
        var m = n
        var validFound = false

        while (m > 0) {
            when (m % 10) {
                3 -> return false
                4 -> return false
                7 -> return false

                2 -> validFound = true
                5 -> validFound = true
                6 -> validFound = true
                9 -> validFound = true
            }
            m /= 10
        }

        return validFound
    }
}
