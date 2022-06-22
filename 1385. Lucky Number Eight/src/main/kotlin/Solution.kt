/*
class Solution {
    fun luckyNumber(n: Int): Int {
        return (1..n).count { "$it".contains('8') }
    }
}*/

class Solution {
    fun luckyNumber(n: Int): Int = (1..n).count { containsEight(it) }

    private fun containsEight(n: Int): Boolean {
        var m = n

        while (m != 0) {
            if (m % 10 == 8) return true

            m /= 10
        }

        return false
    }
}
