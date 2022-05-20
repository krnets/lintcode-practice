/*
class Solution {
    fun prime(n: Int): List<Int> {
        return (2..n).filter { isPrime(it) }
    }

    fun isPrime(n: Int): Boolean {
        if (n == 2 || n == 3 || n == 5) return true
        if (n < 2 || n % 2 == 0 || n % 3 == 0 || n % 5 == 0) return false

        for (i in 5..Math.sqrt(n.toDouble()).toInt() step 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false

        return true
    }
}*/

class Solution {
    fun prime(n: Int): List<Int> = (2..n).filter { isPrime(it) }

    fun isPrime(n: Int): Boolean = (2..Math.sqrt(n.toDouble()).toInt()).none { n % it == 0 }
}