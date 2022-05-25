import java.util.*

class Interval(var start: Int, var end: Int) {}

class Solution {
    fun merge(intervals: List<Interval?>): List<Interval?> {
        if (intervals.isEmpty()) return intervals

        val sortedIntervals = intervals.sortedBy { it!!.start }
        val stack = Stack<Interval>()
        stack.push(sortedIntervals.first())

        for (curr in sortedIntervals.drop(1)) {
            var top = stack.peek()

            if (top.end < curr!!.start)
                stack.push(curr)
            else {
                stack.pop()
                top = Interval(minOf(top.start, curr.start), maxOf(top.end, curr.end))
                stack.push(top)
            }
        }

        return stack
    }
}