class Solution {

    private val columnUsed = mutableSetOf<Int>()
    private val posDiagonal = mutableSetOf<Int>()
    private val negDiagonal = mutableSetOf<Int>()
    private var ans = 0

    fun totalNQueens(n: Int): Int {

        backTrack(0, n)

        return ans
    }

    private fun backTrack(row: Int, n: Int) {
        if (row == n) {
            ans++
            return
        }

        for (c in 0 until n) {
            if (c in columnUsed || (row + c) in posDiagonal || (row - c) in negDiagonal)
                continue

            columnUsed.add(c)
            posDiagonal.add(row + c)
            negDiagonal.add(row - c)

            backTrack(row + 1, n)

            columnUsed.remove(c)
            posDiagonal.remove(row + c)
            negDiagonal.remove(row - c)
        }
    }
}