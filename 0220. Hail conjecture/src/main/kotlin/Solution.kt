class Solution {
    fun getAnswer(num: Int): Int {
        var ans = 0
        var n = num

        while (n > 1) {
            if (n % 2 == 0)
                n /= 2
            else n = 3 * n + 1

            ans++
        }
        return ans
    }
}