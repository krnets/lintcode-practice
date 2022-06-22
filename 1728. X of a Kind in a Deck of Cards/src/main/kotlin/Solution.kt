/*
class Solution {
    fun hasGroupsSizeX(deck: List<Int>): Boolean {
        val map = deck.groupingBy { it }.eachCount()
        var res = 0

        for (p in map) {
            res = gcd(res, p.value)
        }

        return res > 1
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}*/

class Solution {
    fun hasGroupsSizeX(deck: List<Int>): Boolean =
        deck.groupingBy { it }
            .eachCount()
            .entries
            .fold(0) { acc, entry ->
                gcd(acc, entry.value)
            } > 1

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }
}
