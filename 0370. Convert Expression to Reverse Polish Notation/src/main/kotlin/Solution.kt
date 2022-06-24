import java.util.*

class Solution {
    /**
     * @param expression: A string array
     * @return: The Reverse Polish notation of this expression
     */
    fun convertToRPN(expression: Array<String>): List<String> {
        val list = mutableListOf<String>()
        val opStack = ArrayDeque<String>()
        val precMap = mapOf("(" to 1, "+" to 2, "-" to 2, "*" to 3, "/" to 3)

        for (token in expression) {

            if (!precMap.containsKey(token) && token != ")")
                list.add(token)
            else if (token == "(")
                opStack.push("(")
            else if (token == ")") {
                while (opStack.peek() != "(")
                    list.add(opStack.pop())

                opStack.pop()
            } else {
                while (opStack.isNotEmpty() && precMap[opStack.peek()]!! >= precMap[token]!!)
                    list.add(opStack.pop())

                opStack.push(token)
            }
        }
        list.addAll(opStack)

        return list
    }
}
