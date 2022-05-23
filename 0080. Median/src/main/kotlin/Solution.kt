class Solution {
    fun median(nums: IntArray): Int = nums.sorted()[(nums.size - 1) / 2]
}