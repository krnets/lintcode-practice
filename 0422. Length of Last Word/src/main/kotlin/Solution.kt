class Solution {
    fun lengthOfLastWord(s: String): Int {
        if (s.isEmpty()) return 0

        var wordEnd = s.length - 1
        var spaceFound = false

        while (s[wordEnd] == ' ')
            wordEnd--

        var wordStart = wordEnd

        while (wordStart >= 0) {
            if (s[wordStart] == ' ') {
                spaceFound = true
                break
            }
            wordStart--
        }

        return if (spaceFound) wordEnd - wordStart else s.length
    }
}

/*
class Solution {
    fun lengthOfLastWord(s: String): Int =
        if (s.isEmpty()) 0
        else s.split(" ").filterNot { it.isEmpty() }.last().length
}
*/
