class Solution {
    fun wordPattern(pattern: String, teststr: String): Boolean {
        val words = teststr.split(" ")
        val zipped = pattern.toCharArray().zip(words)
        val map = mutableMapOf<Char, String>()
        val usedWords = mutableSetOf<String>()

        for (pair in zipped) {
            if (map.containsKey(pair.first) && map[pair.first] == pair.second)
                continue

            if (!map.containsKey(pair.first) && !usedWords.contains(pair.second)) {
                map[pair.first] = pair.second
                usedWords.add(pair.second)
            } else
                return false
        }

        return true
    }
}