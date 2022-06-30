import java.util.*

class Solution {
    fun find132pattern(nums: IntArray): Boolean {
        val stack = Stack<Int>()
        var third = Int.MIN_VALUE

        for (x in nums.reversed()) {
            if (x < third) return true

            while (stack.isNotEmpty() && x > stack.peek())
                third = stack.pop()

            stack.push(x)
        }

        return false
    }
}