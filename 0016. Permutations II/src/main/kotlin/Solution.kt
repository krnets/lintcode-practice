class Solution {
    fun permuteUnique(nums: IntArray): List<IntArray> {
        val result = mutableListOf<IntArray>()

        dfs(result, mutableListOf(), nums, BooleanArray(nums.size))

        return result
    }

    private fun dfs(result: MutableList<IntArray>, subList: MutableList<Int>, nums: IntArray, used: BooleanArray) {
        if (subList.size == nums.size)
            result.add(subList.toIntArray())
        else
            for (i in nums.indices) {
                if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue

                used[i] = true
                subList.add(nums[i])

                dfs(result, subList, nums, used)

                used[i] = false
                subList.removeLast()
            }
    }
}