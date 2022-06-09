/*
import java.math.BigInteger

class Solution {
    fun updateBits(n: Int, m: Int, i: Int, j: Int): Int {

        val nBinStr = Integer.toBinaryString(n).padStart(32, '0').toCharArray()
        val mBinStr = Integer.toBinaryString(m).padStart(32, '0').toCharArray()

        var nPos = i
        var mPos = 0

        while (nPos <= j) {

            nBinStr[31 - nPos] = mBinStr[31 - mPos]
            nPos++
            mPos++
        }

        val binaryString = nBinStr.joinToString("")

        return BigInteger(binaryString, 2).toInt()
    }
}
*/

class Solution {
    fun updateBits(n: Int, m: Int, i: Int, j: Int): Int {

        val mask = if (j < 31)
            ((1 shl (j + 1)) - (1 shl i)).inv()
        else (1 shl i) - 1

        return (m shl i) + (mask and n)
    }
}
