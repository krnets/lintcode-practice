/*
class Solution {
    fun stretchWord(s: String): Long {
        var count = 1
        var ans = 1L

        for (i in s.indices.drop(1)) {

            if (s[i] != s[i - 1]) {
                if (count >= 2) {
                    ans *= 2
                    count = 1
                }
            } else count++
        }

        if (count >= 2)
            ans *= 2

        return ans
    }
}*/

class Solution {
    fun stretchWord(s: String): Long {
        var count = 1
        var ans = 1L

        for (i in s.indices.drop(1)) {

            if (s[i - 1] == s[i])
                count++
            else if (count >= 2) {
                ans *= 2
                count = 1
            }
        }

        if (count >= 2)
            ans *= 2

        return ans
    }
}
