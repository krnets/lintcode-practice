/*
class Solution {
    fun nextGreatestLetter(letters: String, target: Char): Char {
        for (c in letters)
            if (c > target)
                return c

        return letters.first()
    }
}*/

class Solution {
    fun nextGreatestLetter(letters: String, target: Char): Char =
        letters.firstOrNull { it > target } ?: letters.first()
}
