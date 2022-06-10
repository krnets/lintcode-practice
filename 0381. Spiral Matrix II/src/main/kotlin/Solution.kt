class Solution {
    fun generateMatrix(n: Int): Array<IntArray> {
        var counter = 1
        val matrix = Array(n) { IntArray(n) }
        var startRow = 0
        var endRow = n - 1
        var startCol = 0
        var endCol = n - 1

        while (counter <= n * n) {

            for (j in startCol..endCol) {
                matrix[startRow][j] = counter
                counter++
            }

            startRow++

            for (i in startRow..endRow) {
                matrix[i][endCol] = counter
                counter++
            }

            endCol--

            if (startRow > endRow || startCol > endCol)
                break

            for (j in endCol.downTo(startCol)) {
                matrix[endRow][j] = counter
                counter++
            }

            endRow--

            for (i in endRow.downTo(startRow)) {
                matrix[i][startCol] = counter
                counter++
            }

            startCol++
        }

        return matrix
    }
}
