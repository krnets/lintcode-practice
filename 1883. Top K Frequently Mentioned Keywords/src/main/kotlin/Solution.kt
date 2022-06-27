class Solution {
    fun topkKeywords(k: Int, keywords: Array<String>, reviews: Array<String>): List<String> {
        val keywordFreq = keywords.groupingBy { it }.eachCount().toMutableMap()

        for (review in reviews) {
            val seen = mutableSetOf<String>()

            review.split(" ")
                .map { it.toLowerCase() }
                .filter { it in keywordFreq }
                .forEach { seen.add(it) }

            seen.forEach { keywordFreq[it] = keywordFreq[it]!! + 1 }
        }

        return keywordFreq.keys
            .sortedWith { a, b ->
                if (keywordFreq[a] == keywordFreq[b]) a.compareTo(b)
                else keywordFreq[b]!! - keywordFreq[a]!!
            }.take(k)
    }
}
