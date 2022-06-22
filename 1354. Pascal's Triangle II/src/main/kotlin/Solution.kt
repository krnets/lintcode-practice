import java.math.BigInteger

class Solution {
    /**
     * @param rowIndex: a non-negative index
     * @return: the kth index row of the Pascal's triangle
     */
    fun getRow(rowIndex: Int): List<Int> {
        return List(rowIndex + 1) { nChooseK(rowIndex.toBigInteger(), it.toBigInteger()) }
    }

    private fun nChooseK(n: BigInteger, k: BigInteger): Int {
        return factorial(n).divide(
            factorial(k).multiply(factorial(n.minus(k)))
        ).toInt()
    }

    private fun factorial(n: BigInteger): BigInteger {
        var ans = BigInteger.ONE
        var m = n

        while (m > BigInteger.ZERO) {
            ans *= m
            m--
        }
        return ans
    }
}