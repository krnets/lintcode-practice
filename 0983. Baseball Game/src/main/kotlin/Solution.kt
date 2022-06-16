import java.util.*

class Solution {
    fun calPoints(ops: Array<String>): Int {
        val stack = Stack<Int>()

        for (op in ops) {
            when (op) {
                "C" -> stack.pop()
                "D" -> stack.push(2 * stack.peek())
                "+" -> stack.push(stack.peek() + stack[stack.lastIndex - 1])
                else -> stack.push(op.toInt())
            }
        }

        return stack.sum()
    }
}
