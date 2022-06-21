class Solution {
    fun numJewelsInStones(j: String, s: String): Int = s.count { it in j }
}