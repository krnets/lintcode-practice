class Solution {
    fun trailingZeros(n: Long): Long {
        var ans = 0L
        var div = 5L

        while (n >= div) {
            ans += n / div
            div *= 5L
        }

        return ans
    }
}