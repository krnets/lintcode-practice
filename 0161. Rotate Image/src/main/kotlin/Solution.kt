/*
class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.size

        for (i in 0 until (n / 2 + n % 2)) {
            for (j in 0 until (n / 2)) {
                val temp = matrix[n - j - 1][i]

                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1]
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1]
                matrix[j][n - i - 1] = matrix[i][j]
                matrix[i][j] = temp
            }
        }
    }
}*/

/*
class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val n = matrix.size

        for (i in 0 until (n / 2 + n % 2)) {

            for (j in 0 until (n / 2)) {

                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1].also {

                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1].also {

                        matrix[j][n - i - 1] = matrix[i][j].also {

                            matrix[i][j] = matrix[n - j - 1][i]
                        }
                    }
                }
            }
        }
    }
}
*/

class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {

        val n = matrix.size

        for (i in 0 until (n / 2 + n % 2)) {

            for (j in 0 until (n / 2)) {

                matrix[i][j] = matrix[n - j - 1][i].also {

                    matrix[j][n - i - 1] = matrix[i][j].also {

                        matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1].also {

                            matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1]

                        }
                    }
                }
            }
        }
    }
}
