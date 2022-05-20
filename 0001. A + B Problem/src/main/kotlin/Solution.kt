class Solution {
    fun aplusb(a: Int, b: Int): Int {
        if (b == 0) return a

        val sum = a.xor(b)
        val carry = a.and(b).shl(1)

        return aplusb(sum, carry)
    }
}