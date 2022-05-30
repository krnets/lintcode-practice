class Solution {
    fun reverseInteger(n: Int): Int {
        var ans = 0L
        var m = n

        while (m != 0) {
            ans = 10 * ans + m % 10
            m /= 10
        }

        return if (ans > Int.MAX_VALUE) 0 else ans.toInt()
    }
}