import kotlin.math.pow

class Solution {
    fun getNarcissisticNumbers(n: Int): List<Int> {
        val end = 10.0.pow(n).toInt()
        val start = end / 10 - 1

        return (start until end).filter { isNarcissistic(it, n) }.toList()
    }

    private fun isNarcissistic(digits: Int, n: Int): Boolean {
        var num = digits
        var sum = 0

        while (num > 0) {
            sum += (num % 10).toDouble().pow(n.toDouble()).toInt()
            num /= 10
        }

        return sum == digits
    }
}
