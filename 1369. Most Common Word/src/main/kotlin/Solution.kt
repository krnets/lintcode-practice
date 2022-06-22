class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {

        val wordCount = Regex("\\w+").findAll(paragraph)
            .map { it.value.toLowerCase() }
            .filterNot { it in banned }
            .groupingBy { it }
            .eachCount()

        val mostCommon = wordCount.values.max()

        return wordCount.entries.first { it.value == mostCommon }.key
    }
}