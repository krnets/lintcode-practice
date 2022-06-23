import java.util.*

class Solution {
    /**
     * @param tokens: The Reverse Polish Notation
     * @return: the value
     */
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()

        for (t in tokens) {
            when (t) {
                "+" -> stack.push(stack.pop() + stack.pop())
                "*" -> stack.push(stack.pop() * stack.pop())
                "-" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    stack.push(a - b)
                }
                "/" -> {
                    val b = stack.pop()
                    val a = stack.pop()
                    stack.push(a / b)
                }
                else -> stack.push(t.toInt())
            }
        }

        return stack.peek()
    }
}