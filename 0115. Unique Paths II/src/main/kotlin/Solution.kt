/*
class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        if (obstacleGrid[0][0] == 1) return 0

        val m = obstacleGrid.size
        val n = obstacleGrid.first().size
        val dp = Array(m) { IntArray(n) }
        dp[0][0] = 1

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (obstacleGrid[i][j] == 1)
                    continue
                if (i > 0)
                    dp[i][j] += dp[i - 1][j]
                if (j > 0)
                    dp[i][j] += dp[i][j - 1]
            }
        }

        return dp[m - 1][n - 1]
    }
}
*/

class Solution {
    fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
        val m = obstacleGrid.size
        val n = obstacleGrid.first().size
        val dp = IntArray(n)
        dp[0] = 1

        for (i in 0 until m) {
            for (j in 0 until n) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0
                    continue
                }
                if (i > 0 && j > 0) {
                    dp[j] += dp[j - 1]
                    continue
                }
                if (j > 0)
                    dp[j] = dp[j - 1]
            }
        }

        return dp[n - 1]
    }
}
