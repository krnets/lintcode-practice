class Solution {
    private val result = mutableListOf<String>()

    fun findMissingRanges(nums: IntArray, lower: Int, upper: Int): List<String> {
        val lower = lower.toLong()
        val upper = upper.toLong()
        val nums = nums.map { it.toLong() }

        if (nums.isEmpty()) {
            addRange(lower, upper)
        } else {
            addRange(lower, nums.first() - 1)

            nums.indices.drop(1).forEach {
                addRange(nums[it - 1] + 1, nums[it] - 1)
            }

            addRange(nums.last() + 1, upper)
        }

        return result
    }

    fun addRange(start: Long, end: Long) {
        when {
            start < end -> result.add("$start->$end")
            start == end -> result.add("$start")
        }
    }
}