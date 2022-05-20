class Solution {
    fun reverseInteger(number: Int): Int {
        var ans = 0
        var n = number

        while (n != 0) {
            ans = 10 * ans + n % 10
            n /= 10
        }

        return ans
    }
}