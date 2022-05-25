class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid.first().size

        for (i in 1 until n) grid[i][0] += grid[i - 1][0]
        for (j in 1 until m) grid[0][j] += grid[0][j - 1]

        for (i in 1 until n)
            for (j in 1 until m)
                grid[i][j] += minOf(grid[i - 1][j], grid[i][j - 1])

        return grid[n - 1][m - 1]
    }
}