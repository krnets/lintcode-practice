/*
class Solution {
    fun doubleFactorial(n: Int): Long {
        var ans = n.toLong()
        var m = n - 2

        while (m > 0) {
            ans *= m
            m -= 2
        }
        return ans
    }
}*/

class Solution {
    fun doubleFactorial(n: Int): Long {
        if (n == 1 || n == 2) return n.toLong()

        return n * doubleFactorial(n - 2)
    }
}
