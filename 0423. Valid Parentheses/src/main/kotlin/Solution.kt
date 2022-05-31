import java.util.*

class Solution {
    fun isValidParentheses(s: String): Boolean {
        val stack = Stack<Char>()
        val map = mapOf('(' to ')', '{' to '}', '[' to ']')

        for (c in s) {
            if (map.containsKey(c))
                stack.push(c)
            else if (stack.isNotEmpty() && c == map[stack.peek()])
                stack.pop()
            else return false
        }

        return stack.isEmpty()
    }
}