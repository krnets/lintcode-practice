/*
class Solution {
    fun stringToInteger(target: String): Int {
        return target.toInt()
    }
}*/

class Solution {
    fun stringToInteger(target: String): Int {
        val chars = target.toCharArray()
        val negSign = (chars.first() == '-')
        var ans = 0

        if (negSign) {
            for (c in chars.drop(1))
                ans = 10 * ans + (c - '0')

            ans = -ans
        } else {
            for (c in chars)
                ans = 10 * ans + (c - '0')
        }

        return ans
    }
}