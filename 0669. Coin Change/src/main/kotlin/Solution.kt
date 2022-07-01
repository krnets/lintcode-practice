class Solution {
    /**
     * @param coins: a list of integer
     * @param amount: a total amount of money amount
     * @return: the fewest number of coins that you need to make up
     */
    fun coinChange(coins: IntArray, amount: Int): Int {
        val max = amount + 1
        val dp = IntArray(max) { max }
        dp[0] = 0

        for (a in 1..amount) {
            for (c in coins) {
                if (a - c >= 0) {
                    dp[a] = minOf(dp[a], 1 + dp[a - c])
                }
            }
        }

        return if (dp[amount] == max) -1 else dp[amount]
    }
}
