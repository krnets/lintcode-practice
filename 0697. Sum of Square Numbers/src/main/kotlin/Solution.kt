import kotlin.math.sqrt

class Solution {
    fun checkSumOfSquareNumbers(num: Int): Boolean {
        val x = sqrt(num.toDouble()).toInt()
        val squareNums = (0..x).map { it * it }

        if (squareNums.size == 1) return num == x * x

        var left = 0
        var right = squareNums.lastIndex

        while (left < right) {
            val sum = squareNums[left] + squareNums[right]

            if (sum < num) left++
            else if (sum > num) right--
            else return true
        }

        return false
    }
}