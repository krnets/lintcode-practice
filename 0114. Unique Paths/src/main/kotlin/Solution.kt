/*
class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        var row = IntArray(n) { 1 }

        repeat(m - 1) {
            val newRow = IntArray(n) { 1 }

            (n - 2).downTo(0).forEach { j ->
                newRow[j] = newRow[j + 1] + row[j]
            }
            row = newRow
        }

        return row.first()
    }
}*/

/*
class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val dp = Array(m) { IntArray(n) { 1 } }

        for (i in 1 until m)
            for (j in 1 until n)
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]

        return dp[m - 1][n - 1]
    }
}*/

/*
class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val dp = Array(m) { IntArray(n) }

        for (i in 0 until m)
            for (j in 0 until n)
                if (i == 0 || j == 0)
                    dp[i][j] = 1
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]

        return dp[m - 1][n - 1]
    }
}
*/

class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val dp = IntArray(n)
        dp[0] = 1

        for (i in 0 until m)
            for (j in 1 until n)
                dp[j] += dp[j - 1]

        return dp[n - 1]
    }
}
