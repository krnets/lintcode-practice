class Solution {
    fun climbStairs(n: Int): Int {
        var (a, b) = 0 to 1

        repeat(n) {
            a = b.also { b += a }
        }

        return if (n == 0) a else b
    }
}