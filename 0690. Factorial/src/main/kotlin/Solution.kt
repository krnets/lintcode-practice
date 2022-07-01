import java.math.BigInteger

class Solution {
    fun factorial(n: Int): String {
        var bigN = n.toBigInteger()
        var ans = BigInteger.ONE
        val zero = BigInteger.ZERO

        while (bigN > zero) {
            ans *= bigN
            bigN--
        }

        return ans.toString()
    }
}