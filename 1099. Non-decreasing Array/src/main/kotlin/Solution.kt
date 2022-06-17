class Solution {
    fun checkPossibility(nums: IntArray): Boolean {
        var modified = false

        for (i in nums.indices.drop(1)) {

            if (nums[i - 1] > nums[i])

                if (modified) return false
                else {
                    if (0 <= i - 2 && nums[i] < nums[i - 2])
                        nums[i] = nums[i - 1]

                    modified = true
                }
        }

        return true
    }
}
