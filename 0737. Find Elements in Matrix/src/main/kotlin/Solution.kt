/*
class Solution {
    fun findElements(matrix: Array<IntArray>): Int {
        val freqMap = mutableMapOf<Int, Int>()

        for (i in matrix.indices) {
            for (j in matrix.first().indices) {
                val x = matrix[i][j]
                freqMap[x] = 1 + freqMap.getOrDefault(x, 0)
            }
        }

        return freqMap.maxByOrNull { it.value }!!.key
    }
}*/

class Solution {
    fun findElements(matrix: Array<IntArray>): Int {
        var set1 = matrix.first().toSet()

        for (row in matrix.drop(1)) {
            val set2 = set1.intersect(row.toSet())
            set1 = set2
        }

        return set1.first()
    }
}
