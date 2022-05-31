import java.util.LinkedList

class Solution {
    private lateinit var gridRows: IntRange
    private lateinit var gridCols: IntRange
    private val visited = mutableSetOf<Pair<Int, Int>>()
    private val directions = listOf(1 to 0, -1 to 0, 0 to 1, 0 to -1)

    fun numIslands(grid: Array<BooleanArray>): Int {
        if (grid.isEmpty()) return 0

        gridRows = (grid.indices)
        gridCols = (grid.first().indices)
        var count = 0

        for (i in grid.indices) {
            for (j in grid.first().indices) {
                if (grid[i][j] && !visited.contains(i to j)) {
                    bfs(i, j, grid)
                    count++
                }
            }
        }

        return count
    }

    private fun bfs(i: Int, j: Int, grid: Array<BooleanArray>) {
        val queue = LinkedList<Pair<Int, Int>>()
        visited.add(i to j)
        queue.offer(i to j)

        while (queue.isNotEmpty()) {

            val (row, col) = queue.poll()

            for ((dr, dc) in directions) {
                val r = row + dr
                val c = col + dc

                if (r in gridRows && c in gridCols && grid[r][c] && !visited.contains(r to c)) {

                    queue.offer(r to c)
                    visited.add(r to c)
                }
            }
        }
    }
}

/*
class Solution {
    private lateinit var gridRows: IntRange
    private lateinit var gridCols: IntRange

    fun numIslands(grid: Array<BooleanArray>): Int {
        if (grid.isEmpty()) return 0

        gridRows = (grid.indices)
        gridCols = (grid.first().indices)
        var count = 0

        for (i in gridRows) {
            for (j in gridCols) {
                if (grid[i][j]) {
                    dfs(i, j, grid)
                    count++
                }
            }
        }

        return count
    }

    private fun dfs(i: Int, j: Int, grid: Array<BooleanArray>) {

        if (i !in gridRows || j !in gridCols || !grid[i][j])
            return

        grid[i][j] = false
        dfs(i, j - 1, grid)
        dfs(i, j + 1, grid)
        dfs(i - 1, j, grid)
        dfs(i + 1, j, grid)
    }
}
*/
