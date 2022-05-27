class Solution {
    fun judgeSame(matrix: Array<IntArray>): Boolean {
        val n = matrix.size

        for (i in 1 until n)
            for (j in 1 until n)
                if (matrix[i][j] != matrix[i - 1][j - 1])
                    return false

        return true
    }
}