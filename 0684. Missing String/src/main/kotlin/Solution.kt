class Solution {
    fun missingString(str1: String, str2: String): List<String> {
        val setWords2 = str2.split(" ").toSet()

        return str1.split(" ").filterNot { it in setWords2 }.toList()
    }
}