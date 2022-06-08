class Solution {
    fun subsets(nums: IntArray): List<IntArray> {
        val result = mutableListOf(mutableListOf<Int>())

        for (n in nums) {

            for (i in result.indices) {

                val sub = mutableListOf<Int>()
                sub.addAll(result[i])
                sub.add(n)
                result.add(sub)
            }
        }

        return result.map { it.toIntArray() }
    }
}