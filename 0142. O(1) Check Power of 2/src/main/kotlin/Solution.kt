/*
class Solution {
    fun checkPowerOf2(n: Int): Boolean {
        return n > 0 && n.countOneBits() == 1
    }
}*/

/*
class Solution {
    fun checkPowerOf2(n: Int): Boolean {
        if (n < 0) return false

        var oneBitCount = 0
        var x = n

        while (x > 0) {
            if ((x and 1) == 1)
                oneBitCount++

            x = x shr 1
        }

        return oneBitCount == 1
    }
}
*/

class Solution {
    fun checkPowerOf2(n: Int): Boolean {
        if (n < 0) return false

        var oneBitCount = 0
        var x = n

        while (x > 0) {
            if ((x and 1) == 1)
                oneBitCount++

            x /= 2
        }

        return oneBitCount == 1
    }
}
