/*
class Solution {
    fun printZMatrix(matrix: Array<IntArray>): IntArray {
        val diagonals = mutableListOf<MutableList<Int>>()
        val cols = matrix.first().size

        for (i in 0..(matrix.size + cols))
            diagonals.add(mutableListOf())

        for (r in matrix.indices)
            for (c in 0 until cols)
                diagonals[r + c].add(matrix[r][c])

        return diagonals.mapIndexed { i, nums ->
            when {
                i % 2 == 0 -> nums.reversed()
                else -> nums
            }
        }.flatten().toIntArray()
    }
}*/

/*
class Solution {
    fun printZMatrix(matrix: Array<IntArray>): IntArray {
        val diagonals = mutableListOf<MutableList<Int>>()
        val cols = matrix.first().size

        for (i in 0..(matrix.size + cols))
            diagonals.add(mutableListOf())

        for (r in matrix.indices)
            for (c in 0 until cols)
                diagonals[r + c].add(matrix[r][c])

        return diagonals.flatMapIndexed { i, nums ->
            when {
                i % 2 == 0 -> nums.reversed()
                else -> nums
            }
        }.toIntArray()
    }
}
*/

/*
class Solution {
    fun printZMatrix(matrix: Array<IntArray>): IntArray {
        val diagonals = mutableListOf<MutableList<Int>>()
        val cols = matrix.first().size

        repeat(matrix.size + cols) { diagonals.add(mutableListOf()) }

        for (r in matrix.indices)
            for (c in 0 until cols)
                diagonals[r + c].add(matrix[r][c])

        return diagonals.flatMapIndexed { i, nums ->
            when {
                i % 2 == 0 -> nums.reversed()
                else -> nums
            }
        }.toIntArray()
    }
}
*/

class Solution {
    fun printZMatrix(matrix: Array<IntArray>): IntArray {
        val cols = matrix.first().size
        val diagonals = Array(matrix.size + cols) { mutableListOf<Int>() }

        for (r in matrix.indices)
            for (c in 0 until cols)
                diagonals[r + c].add(matrix[r][c])

        return diagonals.flatMapIndexed { i, nums ->
            when {
                i % 2 == 0 -> nums.reversed()
                else -> nums
            }
        }.toIntArray()
    }
}
