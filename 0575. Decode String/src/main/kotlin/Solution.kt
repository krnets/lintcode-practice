import java.util.*

class Solution {
    /**
     * @param s: an expression includes numbers, letters and brackets
     * @return: a string
     */
    fun expressionExpand(s: String): String {
        val stack = Stack<Char>()

        for (c in s) {
            if (c == ']') {
                val tSb = StringBuilder()
                val kSb = StringBuilder()

                while (stack.peek() != '[') {
                    tSb.append(stack.pop())
                }
                stack.pop()

                while (stack.isNotEmpty() && stack.peek().isDigit()) {
                    kSb.append(stack.pop())
                }
                val t = tSb.reversed().toString()
                val k = kSb.reversed().toString().toInt()

                stack.addAll(t.repeat(k).asIterable())

            } else {
                stack.add(c)
            }
        }

        return stack.joinToString("")
    }
}