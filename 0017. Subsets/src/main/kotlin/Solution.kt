class Solution {
    fun subsets(nums: IntArray): List<IntArray> {
        val subs = MutableList(1 shl nums.size) { mutableListOf<Int>() }

        for (i in subs.indices) {
            for (j in nums.indices) {

                if (1 == i shr j and 1) {
                    subs[i].add(nums[j])
                }
            }
        }

        return subs.map { it.toIntArray() }
    }
}

