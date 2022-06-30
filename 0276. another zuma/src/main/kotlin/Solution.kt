import java.util.*

/*
class Solution {
    */
/**
 * @param s: the pearl sequences.
 * @param k: every k same pearls together will be removed.
 * @return: return the pearls after the game.
 *//*

    fun zumaGaming(s: String, k: Int): String {
        val sb = StringBuilder(s)
        var flag = true

        outer@ while (flag) {
            flag = false
            var start = 0
            var count = 1

            for (i in sb.indices.drop(1)) {

                if (sb[i] == sb[start]) {
                    count++

                    if (count == k) {
                        sb.delete(start, start + k)
                        flag = true

                        continue@outer
                    }
                } else {
                    start = i
                    count = 1
                }
            }
        }

        return sb.toString()
    }
}*/

class Solution {
    fun zumaGaming(s: String, k: Int): String {

        val stack = Stack<Pair<Char, Int>>()
        val ans = StringBuilder()

        stack.push(s.first() to 1)

        for (c in s.drop(1)) {

            if (stack.isNotEmpty() && stack.peek().first == c) {

                var n = stack.peek().second + 1
                stack.push(c to n)

                if (n == k) {

                    while (n > 0) {
                        stack.pop()
                        n--
                    }
                }
            } else {
                stack.push(c to 1)
            }
        }

        while (stack.isNotEmpty()) {
            ans.append(stack.pop().first)
        }

        return ans.reversed().toString()
    }
}
