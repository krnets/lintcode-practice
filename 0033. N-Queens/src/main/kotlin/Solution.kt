class Solution {

    private lateinit var board: Array<CharArray>
    private val res = mutableListOf<MutableList<String>>()
    private val columnUsed = mutableSetOf<Int>()
    private val posDiagonal = mutableSetOf<Int>()
    private val negDiagonal = mutableSetOf<Int>()

    fun solveNQueens(n: Int): List<MutableList<String>> {

        board = Array(n) { ".".repeat(n).toCharArray() }

        backTrack(0, n)

        return res
    }

    private fun backTrack(row: Int, n: Int) {
        if (row == n) {
            val copy = board.map { it.joinToString("") }.toMutableList()
            res.add(copy)
            return
        }

        for (c in 0 until n) {
            if (c in columnUsed || (row + c) in posDiagonal || (row - c) in negDiagonal)
                continue

            columnUsed.add(c)
            posDiagonal.add(row + c)
            negDiagonal.add(row - c)
            board[row][c] = 'Q'

            backTrack(row + 1, n)

            columnUsed.remove(c)
            posDiagonal.remove(row + c)
            negDiagonal.remove(row - c)
            board[row][c] = '.'
        }
    }
}