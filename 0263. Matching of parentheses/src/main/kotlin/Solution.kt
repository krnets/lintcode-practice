import java.util.*

class Solution {
    fun matchParentheses(string: String): Boolean {
        val stack = Stack<Char>()

        for (c in string) {
            if (c == '(')
                stack.push(c)
            else if (stack.isNotEmpty() && stack.peek() == '(')
                stack.pop()
            else return false
        }

        return stack.empty()
    }
}