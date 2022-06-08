class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val zeroPositions = mutableListOf<Pair<Int, Int>>()

        for (i in matrix.indices) {
            for (j in matrix.first().indices) {
                if (matrix[i][j] == 0) {
                    zeroPositions.add(i to j)
                }
            }
        }

        for ((row, col) in zeroPositions) {
            for (j in matrix.first().indices)
                matrix[row][j] = 0

            for (i in matrix.indices)
                matrix[i][col] = 0
        }
    }
}