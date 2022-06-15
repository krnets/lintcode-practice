/*
class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        val binaryX = x.toString(2).padStart(32, '0')
        val binaryY = y.toString(2).padStart(32, '0')

        return binaryX.zip(binaryY).count { it.first != it.second }
    }
}*/

class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        var a = x
        var b = y
        var count = 0

        while (a != 0 && b != 0) {
            if (a.and(1) != b.and(1)) count++

            a = a.shr(1)
            b = b.shr(1)
        }
        while (a != 0) {
            if (a.and(1) == 1) count++
            a = a.shr(1)
        }
        while (b != 0) {
            if (b.and(1) == 1) count++
            b = b.shr(1)
        }

        return count
    }
}

/*
class Solution {
    fun hammingDistance(x: Int, y: Int): Int = x.xor(y).countOneBits()
}
*/

/*
class Solution {
    fun hammingDistance(x: Int, y: Int): Int = (x xor y).countOneBits()

*/
