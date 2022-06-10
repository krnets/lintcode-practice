/*
class Solution {
    fun isPalindrome(s: String): Boolean {
        val chars = s.filter { it.isLetterOrDigit() }.map { it.lowercaseChar() }
        val n = chars.size

        for (i in 0 until n / 2) {
            if (chars[i] != chars[n - i - 1])
                return false
        }

        return true
    }
}*/

/*
class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.lastIndex

        while (left < right) {

            while (left < s.length && !s[left].isLetterOrDigit()) left++

            while (right > 0 && !s[right].isLetterOrDigit()) right--

            if (left < right && s[left].toLowerCase() != s[right].toLowerCase())
                return false

            left++
            right--
        }
        return true
    }
}
*/

class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.lastIndex

        while (left < right) {
            if (!s[left].isLetterOrDigit()) {
                left++
                continue
            } else if (!s[right].isLetterOrDigit()) {
                right--
                continue
            }

            if (s[left].toLowerCase() != s[right].toLowerCase())
                return false

            left++
            right--
        }
        return true
    }
}
