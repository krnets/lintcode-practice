/*
class Solution {
    fun isHappy(n: Int): Boolean {
        val seen = mutableSetOf<Int>()
        var m = n

        while (m > 1) {
            var x = 0

            while (m != 0) {
                val y = m % 10
                m /= 10
                x += (y * y)
            }
            if (seen.contains(x))
                return false

            seen.add(x)
            m = x
        }

        return m == 1
    }
}*/

class Solution {
    fun isHappy(n: Int): Boolean {
        var slow = n
        var fast = squareSum(n)

        while (slow != fast) {
            slow = squareSum(slow)
            fast = squareSum(squareSum(fast))
        }

        return slow == 1
    }

    private fun squareSum(n: Int): Int {
        var sum = 0
        var m = n

        while (m > 0) {
            val y = m % 10
            m /= 10
            sum += (y * y)
        }

        return sum
    }
}
