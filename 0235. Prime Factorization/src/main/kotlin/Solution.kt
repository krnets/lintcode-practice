class Solution {
    fun primeFactorization(num: Int): List<Int> {
        val list = mutableListOf<Int>()
        var x = num
        val limit = Math.sqrt(num.toDouble()).toInt()

        for (i in 2..limit)
            while (x % i == 0) {
                list.add(i)
                x /= i
            }

        return if (x > 1) list + x else list
    }
}