import java.util.*

class Solution {
    /**
     * @param expression: A string array
     * @return: The Reverse Polish notation of this expression
     */
    fun convertToRPN(expression: Array<String>): List<String> {
        val list = mutableListOf<String>()
        val stack = Stack<String>()
        val ops = "+-*/"

        for (x in expression) {

            if (!"()".contains(x)) {

                if (ops.contains(x)) {

                    if (ops.contains(stack.peek())) {

                        val op = stack.pop()
                        val a = stack.pop()
                        list.add(a)
                        list.add(x)
                        list.add(op)

                    } else {
                        stack.push(x)
                    }
                } else {
                    stack.push(x)
                }
            }
        }

        return list
    }
}












