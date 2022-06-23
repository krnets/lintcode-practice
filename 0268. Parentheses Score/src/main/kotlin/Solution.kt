import java.util.*
import kotlin.math.max

class Solution {
    /**
     * @param s: a string with "(" and ")"
     * @return: return the score of the string
     */
    fun parenthesesScore(s: String): Int {
        var score = 0
        val stack = Stack<Int>()

        for (c in s) {
            score = if (c == '(') {
                stack.push(score)
                0
            } else stack.pop() + max(2 * score, 1)
        }

        return score
    }
}