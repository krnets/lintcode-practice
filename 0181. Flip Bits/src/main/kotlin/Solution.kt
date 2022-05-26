/*
class Solution {
    fun bitSwapRequired(a: Int, b: Int): Int {
        var aBinary = a.toString(2)
        var bBinary = b.toString(2)

        aBinary = when {
            a < 0 -> aBinary.drop(1).padStart(32, '1')
            else -> aBinary.padStart(32, '0')
        }
        bBinary = when {
            b < 0 -> bBinary.drop(1).padStart(32, '1')
            else -> bBinary.padStart(32, '0')
        }
        return aBinary.zip(bBinary).count { it.first != it.second }
    }
}*/

/*
class Solution {
    fun bitSwapRequired(a: Int, b: Int): Int {
        var c = a.and(Int.MAX_VALUE).xor(b.and(Int.MAX_VALUE))
        var res = if (a.xor(b) < 0) 1 else 0

        while (c != 0) {
            res++
            c = c.and(c - 1)
        }
        return res
    }
}
*/

class Solution {
    fun bitSwapRequired(a: Int, b: Int): Int {
        var count = 0

        for (i in 0 until 32)
            if (a.shr(i).and(1) != b.shr(i).and(1))
                count++

        return count
    }
}
