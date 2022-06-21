/*
class Solution {
    fun uncommonFromSentences(a: String, b: String): Array<String> {
        val wordsA = a.split(" ")
        val wordsB = b.split(" ")
        val common = wordsA.toSet().intersect(wordsB.toSet())
        val freqCountA = wordsA.groupingBy { it }.eachCount()
        val freqCountB = wordsB.groupingBy { it }.eachCount()
        val uniqueA = wordsA.filterNot { it in common || freqCountA[it]!! > 1 }
        val uniqueB = wordsB.filterNot { it in common || freqCountB[it]!! > 1 }

        return (uniqueA + uniqueB).toTypedArray()
    }
}*/

class Solution {
    fun uncommonFromSentences(a: String, b: String): Array<String> {
        val wordsA = a.split(" ")
        val wordsB = b.split(" ")
        val freqCount = mutableMapOf<String, Int>()
        val result = mutableListOf<String>()

        for (w in wordsA) freqCount[w] = 1 + freqCount.getOrDefault(w, 0)
        for (w in wordsB) freqCount[w] = 1 + freqCount.getOrDefault(w, 0)

        for ((w, count) in freqCount)
            if (count == 1)
                result.add(w)

        return result.toTypedArray()
    }
}
