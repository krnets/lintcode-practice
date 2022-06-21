/*
class Solution {
    fun maximumMoment(time: String): String {
        val chars = time.toCharArray()

        if (chars[0] == '?') {
            if (chars[1] == '?') {
                chars[0] = '2'
                chars[1] = '3'
            } else if (chars[1] in '0'..'3')
                chars[0] = '2'
            else {
                chars[0] = '1'
            }
        }
        if (chars[1] == '?') {
            if (chars[0] == '2')
                chars[1] = '3'
            else chars[1] = '9'
        }
        if (chars[3] == '?') {
            chars[3] = '5'
        }
        if (chars[4] == '?')
            chars[4] = '9'

        return chars.joinToString("")
    }
}*/

class Solution {
    fun maximumMoment(time: String): String {
        val chars = time.toCharArray()

        if (chars[0] == '?') {
            if (chars[1]  in '4'..'9')
                chars[0] = '1'
            else chars[0] = '2'
        }
        if (chars[1] == '?') {
            if (chars[0] == '2')
                chars[1] = '3'
            else chars[1] = '9'
        }
        if (chars[3] == '?') {
            chars[3] = '5'
        }
        if (chars[4] == '?')
            chars[4] = '9'

        return chars.joinToString("")
    }
}
