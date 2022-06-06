/*
class Solution {
    fun isBuild(x: Int): String {
        return if (x == 4 || x == 5 || x == 8 ||  x == 11) "NO" else "YES"
    }
}*/

class Solution {
    fun isBuild(x: Int): String {
        if (x < 7) return if (x == 3) "YES" else "NO"

        val dp = BooleanArray(x + 1)
        dp[3] = true
        dp[7] = true

        for (i in 8..x)
            dp[i] = dp[i - 3] || dp[i - 7]

        return if (dp[x]) "YES" else "NO"
    }
}
