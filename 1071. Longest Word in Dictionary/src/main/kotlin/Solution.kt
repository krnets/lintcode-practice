class Solution {
    fun longestWord(words: Array<String>): String {
        words.sortWith { a, b ->
            if (a.length == b.length)
                b.compareTo(a)
            else a.length - b.length
        }

        val candidates = mutableSetOf("")
        var longest = ""

        for (word in words) {
            if (candidates.contains(word.substring(0, word.length - 1))) {
                candidates.add(word)
                longest = word
            }
        }

        return longest
    }
}