/*
class Solution {
    fun singleNumberIII(a: IntArray): List<Int> =
        a.groupBy { it }
            .entries
            .filter { it.value.size == 1 }
            .map { it.key }
}*/

/*
class Solution {
    fun singleNumberIII(a: IntArray): List<Int> {
        val xorSum = a.fold(0) { acc, i -> acc xor i }
        val lowestSetBit = if (xorSum == Int.MIN_VALUE) xorSum else xorSum and -xorSum
        var type1 = 0
        var type2 = 0

        a.forEach { num ->
            if (num and lowestSetBit != 0)
                type1 = type1 xor num
            else type2 = type2 xor num
        }
        return listOf(type2, type1)
    }
}
*/

class Solution {
    fun singleNumberIII(a: IntArray): List<Int> {
        val xorSum = a.fold(0) { acc, i -> acc xor i }
        val lowestSetBit = if (xorSum == Int.MIN_VALUE) xorSum else xorSum and -xorSum
        var type1 = 0
        var type2 = 0

        for (num in a) {
            if (num and lowestSetBit != 0)
                type1 = type1 xor num
            else type2 = type2 xor num
        }
        return listOf(type2, type1)
    }
}

