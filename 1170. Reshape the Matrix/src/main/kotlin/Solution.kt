/*
class Solution {
    fun matrixReshape(nums: Array<IntArray>, r: Int, c: Int): Array<IntArray> =
        if (nums.size * nums.first().size != r * c) nums
        else nums.flatMap { it.asIterable() }
            .chunked(c)
            .map { it.toIntArray() }
            .toTypedArray()
}*/

class Solution {
    fun matrixReshape(nums: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        val m = nums.size
        val n = nums.first().size

        if (m * n != r * c) return nums

        val result = Array(r) { IntArray(c) }

        for (x in 0 until (m * n)) {

            result[x / c][x % c] = nums[x / n][x % n]
        }

        return result
    }
}
