/*
class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (row in matrix)
            for (x in row)
                if (x == target)
                    return true

        return false
    }
}*/

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val m = matrix.size
        val n = matrix.first().size
        var low = 0
        var high = n * m - 1

        while (low <= high) {
            val mid = (high - low) / 2 + low

            val x = matrix[mid / n][mid % n]

            if (x < target) {
                low = mid + 1
            } else if (x > target) {
                high = mid - 1
            } else return true
        }

        return false
    }
}