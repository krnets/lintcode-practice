class Solution {
    fun winSum(nums: IntArray, k: Int): IntArray {
        if (k == 0 ) return nums

        val result = IntArray(nums.size - k + 1)
        var sum = nums.take(k - 1).sum()

        for (i in result.indices) {
            sum += nums[i + k - 1]
            result[i] = sum
            sum -= nums[i]
        }

        return result
    }
}

/*
class Solution {
    fun winSum(nums: IntArray, k: Int): IntArray =
        if (k == 0) nums
        else nums.asSequence().windowed(k).map { it.sum() }.toList().toIntArray()
}
*/
