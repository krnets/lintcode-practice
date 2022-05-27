class Solution {
    fun interleavedArray(a: IntArray, b: IntArray): IntArray {
        val result = IntArray(2 * a.size)

        for (i in a.indices) {
            result[2 * i] = a[i]
            result[2 * i + 1] = b[i]
        }

        return result
    }
}