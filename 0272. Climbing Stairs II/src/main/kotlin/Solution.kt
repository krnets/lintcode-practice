/*
class Solution {
    fun climbStairs2(n: Int): Int {
        if (n <= 1) return 1
        if (n == 2) return 2

        var a = 1
        var b = 1
        var c = 2

        for (i in 3..(n))
            a = b.also {
                b = c.also {
                    c += a + b
                }
            }

        return c
    }
}*/

class Solution {
    fun climbStairs2(n: Int): Int {
        if (n <= 1) return 1
        if (n == 2) return 2

        var a = 1
        var b = 1
        var c = 2

        repeat(n - 2) {
            a = b.also {
                b = c.also {
                    c += a + b
                }
            }
        }

        return c
    }
}
