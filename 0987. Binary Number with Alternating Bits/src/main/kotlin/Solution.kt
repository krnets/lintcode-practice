class Solution {
    fun hasAlternatingBits(n: Int): Boolean {
        val p = n.xor(n.shr(1))

        return p.and(p + 1) == 0
    }
}

/*
class Solution {
    fun hasAlternatingBits(n: Int): Boolean {
        var prev = 2
        var m = n

        while (m != 0) {
            val curr = m % 2

            if (curr == prev) return false

            prev = curr
            m /= 2
        }
        return true
    }
}
*/
