class Solution {
    fun imageSmoother(m: Array<IntArray>): Array<IntArray> {
        val rows = m.size
        val cols = m.first().size
        val result = Array(rows) { IntArray(cols) }
        val z = intArrayOf(-1, 0, 1)

        for (row in m.indices) {
            for (col in m.first().indices) {

                var count = 0
                var sum = 0

                for (innerR in z) {
                    for (innerC in z) {
                        if (isValid(row + innerR, col + innerC, rows, cols)) {
                            count++
                            sum += m[row + innerR][col + innerC]
                        }
                    }
                }

                result[row][col] = sum / count
            }
        }

        return result
    }

    private fun isValid(i: Int, j: Int, rows: Int, cols: Int): Boolean =
        (i in 0 until rows) && (j in 0 until cols)
}