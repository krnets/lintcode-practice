class Solution {
    fun detectCapitalUse(word: String): Boolean =
        if (word.first().isUpperCase())
            word.drop(1).all { it.isUpperCase() } || word.drop(1).all { it.isLowerCase() }
        else word.all { it.isLowerCase() }
}