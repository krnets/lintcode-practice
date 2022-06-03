class Solution {
    fun isUgly(num: Int): Boolean {
        if (num <= 0) return false

        var n = num

        for (k in listOf(2, 3, 5))
            while (n % k == 0)
                n /= k

        return n == 1
    }
}