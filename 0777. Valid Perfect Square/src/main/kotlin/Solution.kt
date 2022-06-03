/*
import kotlin.math.sqrt

class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        val m = num.toDouble()
        val x = sqrt(m).toInt()

        return x * x == num
    }
}
*/

class Solution {
    fun isPerfectSquare(num: Int): Boolean {
        var low = 1
        var high = num

        while (low <= high) {
            val mid = low + (high - low) / 2
            val x = num / mid

            if (num % x == 0 && x == mid) return true
            else if (x > mid) low = mid + 1
            else high = mid - 1
        }
        return false
    }
}
