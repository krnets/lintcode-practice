class Solution {
    fun nthSuperUglyNumber(n: Int, primes: IntArray): Int {
        val uglies = mutableListOf(1)
        val primesPos = IntArray(primes.size)

        while (uglies.size < n) {

            var x = Int.MAX_VALUE

            for (i in primes.indices) {
                x = minOf(x, uglies[primesPos[i]] * primes[i])
            }

            uglies.add(x)

            for (i in primes.indices) {
                if (x == primes[i] * uglies[primesPos[i]])
                    primesPos[i]++
            }
        }

        return uglies.last()
    }
}

/*
class Solution {
    fun nthSuperUglyNumber(n: Int, primes: IntArray): Int {
        val uglies = mutableListOf(1)
        val primesPos = IntArray(primes.size)

        while (uglies.size < n) {

            val x = primes.indices.minOf { uglies[primesPos[it]] * primes[it] }

            uglies.add(x)

            for (i in primes.indices) {
                if (x == primes[i] * uglies[primesPos[i]])
                    primesPos[i]++
            }
        }

        return uglies.last()
    }
}
*/
