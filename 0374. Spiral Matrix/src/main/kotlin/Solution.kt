class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val list = mutableListOf<Int>()

        if (matrix.isEmpty()) return list

        var startRow = 0
        var startCol = 0
        var endRow = matrix.lastIndex
        var endCol = matrix.first().lastIndex

        while (startRow <= endRow && startCol <= endCol) {

            for (j in startCol..endCol)
                list.add(matrix[startRow][j])

            startRow++

            for (i in startRow..endRow)
                list.add(matrix[i][endCol])

            endCol--

            if (startRow > endRow || startCol > endCol)
                break

            for (j in endCol.downTo(startCol))
                list.add(matrix[endRow][j])

            endRow--

            for (i in endRow.downTo(startRow))
                list.add(matrix[i][startCol])

            startCol++
        }

        return list
    }
}
