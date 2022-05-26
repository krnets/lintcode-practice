import java.util.*

/*
class Solution {
    fun firstUniqChar(str: String): Char =
        str.groupingBy { it }
            .eachCount()
            .let { freqMap ->
                str.first { freqMap[it] == 1 }
            }
}*/

class Solution {
    fun firstUniqChar(str: String): Char {

        val position = mutableMapOf<Char, Int>()
        val queue = LinkedList<Pair<Char, Int>>()

        return str.forEachIndexed { i, c ->

            if (position.containsKey(c)) {
                position[c] = -1

                while (queue.isNotEmpty() && position[queue.peek().first] == -1)
                    queue.poll()
            } else {
                position[c] = i
                queue.offer(c to i)
            }
        }.let {
            queue.peek().first
        }
    }
}
