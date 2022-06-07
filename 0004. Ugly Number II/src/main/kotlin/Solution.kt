/*
class Solution {
    fun nthUglyNumber(n: Int): Int {
        val uglies = IntArray(n)
        uglies[0] = 1

        var nextMult2 = 2
        var nextMult3 = 3
        var nextMult5 = 5

        var i2 = 0
        var i3 = 0
        var i5 = 0

        var nextUgly = 1

        for (i in 1 until n) {
            nextUgly = minOf(nextMult2, nextMult3, nextMult5)
            uglies[i] = nextUgly

            if (nextMult2 == nextUgly) {
                i2++
                nextMult2 = 2 * uglies[i2]
            }

            if (nextMult3 == nextUgly) {
                i3++
                nextMult3 = 3 * uglies[i3]
            }

            if (nextMult5 == nextUgly) {
                i5++
                nextMult5 = 5 * uglies[i5]
            }
        }

        return nextUgly
    }
}
*/

class Solution {
    fun nthUglyNumber(n: Int): Int {
        val uglies = mutableListOf(1)
        var i = 0
        var j = 0
        var k = 0

        while (uglies.size < n) {
            val x = minOf(2 * uglies[i], 3 * uglies[j], 5 * uglies[k])

            uglies.add(x)

            if (x == 2 * uglies[i]) i++
            if (x == 3 * uglies[j]) j++
            if (x == 5 * uglies[k]) k++
        }

        return uglies.last()
    }
}
