/*
class Solution {
    fun calculateNumber(num: Int): IntArray {
        val idx = mutableListOf<Int>()
        val binary = num.toString(2)

        for ((i, v) in binary.withIndex()) {
            if (v == '1') {
                idx.add(i + 1)
            }
        }

        return intArrayOf(idx.size) + idx
    }
}*/

class Solution {
    fun calculateNumber(num: Int): IntArray {
        val idx = num.toString(2)
            .withIndex()
            .filter { it.value == '1' }
            .map { it.index + 1 }

        return intArrayOf(idx.size) + idx
    }
}
