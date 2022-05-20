import kotlin.math.sign

/*
class Solution {
    fun productExcludeItself(nums: List<Int>): List<Long> {
        val result = mutableListOf<Long>()
        var prefixProduct = 1L

        for (i in nums.indices) {

            val x = prefixProduct * nums.subList(i + 1, nums.size).fold(1L) { acc, i -> acc * i }
            result.add(x)
            prefixProduct *= nums[i]
        }
        return result
    }
}*/

class Solution {
    fun productExcludeItself(nums: List<Int>): List<Long> {
        val result = (nums.indices)
            .drop(1)
            .scan(1L) { acc, i ->
                acc * nums[i - 1]
            }.toMutableList()

        var prefixProduct = 1L

        for (i in nums.lastIndex.downTo(0)) {
            result[i] *= prefixProduct
            prefixProduct *= nums[i]
        }
        return result
    }
}
