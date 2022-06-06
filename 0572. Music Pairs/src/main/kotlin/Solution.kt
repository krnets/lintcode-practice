/*
class Solution {
    fun musicPairs(musics: IntArray): Long {
        var ans = 0L
        val numCount = IntArray(61)

        for (x in musics) {
            ans += numCount[60 - x]
            numCount[x % 60]++
        }

        return ans
    }
}
*/

class Solution {
    fun musicPairs(musics: IntArray): Long {
        var ans = 0
        val numCount = IntArray(61)

        for (x in musics) {
            if (x == 60)
                ans += numCount[x]
            else ans += numCount[60 - x]

            numCount[x]++
        }
        return ans.toLong()
    }
}
