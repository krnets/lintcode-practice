class Solution {
    private val morseCode = listOf(
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
        "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."
    )

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        return words.map { toMorseCode(it).joinToString("") }.toSet().size
    }

    private fun toMorseCode(word: String): List<String> {
        return word.map { morseCode[it - 'a'] }
    }
}