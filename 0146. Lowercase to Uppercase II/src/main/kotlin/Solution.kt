class Solution {
    fun lowercaseToUppercase2(letters: String): String = letters.map {
        if (it.isLowerCase())
            it - 32
        else it
    }.joinToString("")
}