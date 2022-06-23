/*
class Solution {
    fun grayCode(n: Int): List<Int> {
        val result = MutableList(1 shl n) { 0 }

        for (i in result.indices)
            result[i] = (i shr 1) xor i

        return result
    }
}*/

class Solution {
    fun grayCode(n: Int): List<Int> =
        (0 until (1 shl n))
            .map { it xor (it shr 1) }
}
