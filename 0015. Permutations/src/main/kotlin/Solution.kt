/*
class Solution {
    fun permute(nums: IntArray): List<IntArray> {
        val result = mutableListOf<IntArray>()

        dfs(result, mutableListOf(), nums)

        return result
    }

    private fun dfs(result: MutableList<IntArray>, subList: MutableList<Int>, nums: IntArray) {
        if (subList.size == nums.size)
            result.add(subList.toIntArray())
        else
            for (i in nums.indices) {

                if (subList.contains(nums[i])) continue

                subList.add(nums[i])
                dfs(result, subList, nums)
                subList.removeLast()
            }
    }
}*/

class Solution {
    fun permute(nums: IntArray): List<IntArray> {
        val result = mutableListOf<IntArray>()

        dfs(result, mutableListOf(), nums)

        return result
    }

    private fun dfs(result: MutableList<IntArray>, subList: MutableList<Int>, nums: IntArray) {
        if (subList.size == nums.size)
            result.add(subList.toIntArray())
        else
            for (x in nums) {

                if (subList.contains(x)) continue

                subList.add(x)
                dfs(result, subList, nums)
                subList.removeLast()
            }
    }
}
