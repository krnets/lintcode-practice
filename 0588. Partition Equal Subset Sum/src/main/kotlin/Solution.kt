class Solution {
    /**
     * @param nums: a non-empty array only positive integers
     * @return: true if can partition or false
     */
    fun canPartition(nums: IntArray): Boolean {
        val sum = nums.sum()

        if (sum % 2 == 1) return false

        val target = sum / 2
        var subSums = mutableSetOf<Int>()
        subSums.add(0)

        for (x in nums.reversed()) {
            val nextSet = mutableSetOf<Int>()

            for (t in subSums) {
                if (t + x == target) return true
                nextSet.add(t + x)
                nextSet.add(t)
            }
            subSums = nextSet
        }

        return false
    }
}