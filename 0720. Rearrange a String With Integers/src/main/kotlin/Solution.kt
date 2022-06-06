class Solution {
    fun rearrange(str: String): String {
        if (str.isEmpty()) return str

        val (letters, digits) = str.partition { it.isLetter() }

        return letters.asSequence().sorted().joinToString("") + digits.map { it - '0' }.sum()
    }
}

//        return letters.asSequence().sorted().joinToString("") + digits.sumOf { it.digitToInt() }
