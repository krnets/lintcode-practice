class Solution {
    fun numWays(n: Int, k: Int): Int {
        val dp = intArrayOf(0, k, k * k, 0)

        if (n <= 2) return dp[n]
        if (k == 1) return 0

        for (i in 2 until n) {
            dp[3] = (k - 1) * (dp[1] + dp[2])
            dp[1] = dp[2]
            dp[2] = dp[3]
        }

        return dp[3]
    }
}