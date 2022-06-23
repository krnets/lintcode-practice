class Solution {
    fun divide(dividend: Int, divisor: Int): Int {
        val isNegative = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)
        var longDividend = Math.abs(dividend.toLong())
        val longDivisor = Math.abs(divisor.toLong())
        var ans = 0L

        while (longDividend >= longDivisor) {
            var temp = longDivisor
            var count = 1

            while (longDividend >= temp) {
                longDividend -= temp
                ans += count
                count = count shl 1
                temp = temp shl 1
            }
        }

        if (isNegative) ans = -ans

        return if (ans < Int.MIN_VALUE || ans > Int.MAX_VALUE) Int.MAX_VALUE else ans.toInt()
    }
}