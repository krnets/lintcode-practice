/*
class Solution {
    fun digitCounts(k: Int, n: Int): Int = (0..n).joinToString("") { "$it" }.count { "$it" == "$k" }
}*/

class Solution {
    fun digitCounts(k: Int, n: Int): Int {
        var ans = 0

        for (i in 0..n) {
            var t = i

            do {
                if (t % 10 == k)
                    ans++

                t /= 10
            } while (t > 0)
        }

        return ans
    }
}
