/*
class Solution {
    fun titleToNumber(s: String): Int {
        var ans = 0

        for (c in s)
            ans = 26 * ans + (c - 'A' + 1)

        return ans
    }
}*/

class Solution {
    fun titleToNumber(s: String): Int = s.fold(0) { acc, c ->
        acc * 26 + (c - 'A' + 1)
    }
}
