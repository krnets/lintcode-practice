/*
import java.util.PriorityQueue

class Solution {
    fun topKFrequentWords(words: Array<String>, k: Int): Array<String> {
        val wordFreq = words.groupingBy { it }.eachCount()

        val minHeap = PriorityQueue<String> { a, b ->
            if (wordFreq[a] == wordFreq[b]) b.compareTo(a)
            else wordFreq[a]!! - wordFreq[b]!!
        }

        for (word in wordFreq.keys) {
            minHeap.offer(word)

            if (minHeap.size > k)
                minHeap.poll()
        }
        val list = mutableListOf<String>()

        while (minHeap.isNotEmpty())
            list.add(0, minHeap.poll())

        return list.toTypedArray()
    }
}*/

/*
class Solution {
    fun topKFrequentWords(words: Array<String>, k: Int): Array<String> {
        val wordFreq = words.groupingBy { it }.eachCount()

        return wordFreq.keys.sortedWith { a, b ->
            if (wordFreq[a] == wordFreq[b]) a.compareTo(b)
            else wordFreq[b]!! - wordFreq[a]!!

        }.take(k).toTypedArray()
    }
}
*/

class Solution {
    fun topKFrequentWords(words: Array<String>, k: Int): Array<String> =
        words.groupingBy { it }
            .eachCount()
            .let { wordFreq ->
                wordFreq.keys
                    .sortedWith { a, b ->
                        if (wordFreq[a] == wordFreq[b]) a.compareTo(b)
                        else wordFreq[b]!! - wordFreq[a]!!
                    }
                    .take(k)
                    .toTypedArray()
            }
}
