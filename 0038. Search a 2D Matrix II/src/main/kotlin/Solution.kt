/*
class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Int {
        var ans = 0

        for (i in matrix.indices)
            for (j in matrix.first().indices)
                if (matrix[i][j] == target)
                    ans++

        return ans
    }
}*/

/*
class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Int {
        var i = matrix.size - 1
        var j = 0
        var ans = 0

        while (i >= 0 && j < matrix.first().size) {

            if (target < matrix[i][j])
                i--
            else if (target > matrix[i][j])
                j++
            else {
                ans++
                j++
            }
        }

        return ans
    }
}
*/

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Int {
        var ans = 0
        val n = matrix.first().size

        for (i in matrix.indices) {
            var low = 0
            var high = n - 1

            while (low <= high) {
                val mid = low + (high - low) / 2

                if (target < matrix[i][mid])
                    high = mid - 1
                else if (target > matrix[i][mid])
                    low = mid + 1
                else {
                    ans++
                    break
                }
            }
        }
        return ans
    }
}
