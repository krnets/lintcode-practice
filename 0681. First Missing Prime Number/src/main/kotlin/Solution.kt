/*
class Solution {
    fun firstMissingPrime(nums: IntArray): Int {
        var nextPrime = 2

        for (n in nums) {
            if (n != nextPrime)
                return nextPrime

            nextPrime = findNextPrime(nextPrime + 1)
        }

        return nextPrime
    }

    private fun findNextPrime(n: Int): Int {
        var ans = n

        while (!isPrime(ans)) ans++

        return ans
    }

    private fun isPrime(n: Int): Boolean = (2..Math.sqrt(n.toDouble()).toInt()).none { n % it == 0 }
}*/

/*
class Solution {
    fun firstMissingPrime(nums: IntArray): Int {
        var nextPrime = 2

        for (n in nums) {
            if (n != nextPrime)
                return nextPrime

            nextPrime = findNextPrime(nextPrime + 1)
        }

        return nextPrime
    }

    private fun findNextPrime(n: Int): Int = generateSequence(n) { it + 1 }.first { isPrime(it) }

    private fun isPrime(n: Int): Boolean = (2..Math.sqrt(n.toDouble()).toInt()).none { n % it == 0 }
}
*/

/*
class Solution {
    fun firstMissingPrime(nums: IntArray): Int {
        var nextPrime = 2

        for (n in nums) {
            if (n != nextPrime)
                return nextPrime

            nextPrime = generateSequence(nextPrime + 1) { it + 1 }.first { isPrime(it) }
        }

        return nextPrime
    }

    private fun isPrime(n: Int): Boolean = (2..Math.sqrt(n.toDouble()).toInt()).none { n % it == 0 }
}
*/

class Solution {
    fun firstMissingPrime(nums: IntArray): Int =
        generateSequence(2) { it + 1 }.first { isPrime(it) && it !in nums }

    private fun isPrime(n: Int): Boolean =
        (2..Math.sqrt(n.toDouble()).toInt()).none { n % it == 0 }
}
