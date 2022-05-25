/*
class Solution {
    fun sqrt(x: Int): Int {
        return Math.sqrt(x.toDouble()).toInt()
    }
}
*/

/*
class Solution {
    fun sqrt(x: Int): Int {
        if (x == 0) return 0

        val C = x.toDouble()
        var x0 = x.toDouble()
        val epsilon = 1e-7

        while (true) {
            val x1 = 0.5 * (x0 + C / x0)

            if (Math.abs(x0 - x1) < epsilon)
                break

            x0 = x1
        }

        return x0.toInt()
    }
}
*/

class Solution {
    fun sqrt(x: Int): Int {
        var low = 0L
        val xLong = x.toLong()
        var high = xLong

        while (low + 1 < high) {
            val mid = low + (high - low) / 2

            if (mid * mid == xLong)
                return mid.toInt()
            else if (mid * mid < xLong) {
                low = mid
            } else
                high = mid
        }

        return if (high * high == xLong) high.toInt() else low.toInt()
    }
}
