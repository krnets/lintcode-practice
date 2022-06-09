import java.util.*

class Solution {
    fun deleteChar(str: String, k: Int): String {
        val stack = Stack<Char>()

        for (i in str.indices) {
            val c = str[i]

            while (stack.isNotEmpty() &&
                c < stack.peek() &&
                i < str.length - (k - stack.size)
            ) {
                stack.pop()
            }

            stack.push(c)
        }

        return stack.take(k).joinToString("")
    }
}