import java.util.*

/*
class Solution {
    private val result = mutableListOf<String>()

    fun letterCasePermutation(s: String): List<String> {
        val chars = s.toCharArray()

        dfs(chars, 0)

        return result
    }

    private fun dfs(chars: CharArray, pos: Int) {
        if (pos == chars.size) {
            result.add(chars.joinToString(""))
            return
        }

        if (chars[pos].isDigit()) {
            dfs(chars, pos + 1)
            return
        }

        chars[pos] = chars[pos].toLowerCase()
        dfs(chars, pos + 1)

        chars[pos] = chars[pos].toUpperCase()
        dfs(chars, pos + 1)
    }
}*/

/*
class Solution {
    fun letterCasePermutation(s: String): List<String> {
        if (s.isEmpty()) return listOf("")

        val queue = LinkedList<String>()
        queue.offer(s)

        for (i in s.indices) {
            if (s[i].isDigit()) continue

            for (j in queue.indices) {
                val curr = queue.poll()
                val chars = curr.toCharArray()

                chars[i] = chars[i].toLowerCase()
                queue.offer(chars.joinToString(""))

                chars[i] = chars[i].toUpperCase()
                queue.offer(chars.joinToString(""))
            }
        }

        return queue.toList()
    }
}
*/

class Solution {
    fun letterCasePermutation(s: String): List<String> {
        val queue = LinkedList<String>()
        queue.offer(s)

        for (i in s.indices) {
            if (s[i].isLetter()) {
                for (j in queue.indices) {
                    val t = queue.poll()
                    queue.add(t.take(i) + s[i].toLowerCase() + t.drop(i + 1))
                    queue.add(t.take(i) + s[i].toUpperCase() + t.drop(i + 1))
                }
            }
        }
        return queue.toList()
    }
}
