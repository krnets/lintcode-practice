class Solution {
    fun orderCheck(heights: List<Int>): Int =
        heights.zip(heights.sorted()).count { it.first != it.second }
}