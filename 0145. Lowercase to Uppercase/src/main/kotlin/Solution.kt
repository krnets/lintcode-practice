/*
class Solution {
    fun lowercaseToUppercase(character: Char): Char = character.uppercaseChar()
}*/

/*
class Solution {
    fun lowercaseToUppercase(character: Char): Char = character.toUpperCase()
}
*/

class Solution {
    fun lowercaseToUppercase(character: Char): Char = character - 32
}
