class Solution {
    fun singleNumber(a: IntArray): Int = a.reduce { acc, i -> acc.xor(i) }
}
