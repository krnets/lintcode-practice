class Interval(var start: Int, var end: Int) {}

class Solution {
    fun insert(intervals: List<Interval?>, newInterval: Interval?): List<Interval?> {
        val mutIntervals = intervals.toMutableList()
        val result = mutableListOf<Interval?>()
        var pos = intervals.size

        for (i in intervals.indices) {
            if (intervals[i]!!.start >= newInterval!!.start) {
                pos = i
                break
            }
        }

        mutIntervals.add(pos, newInterval)

        for (x in mutIntervals) {
            if (result.isEmpty() || x!!.start > result.last()!!.end)
                result.add(x)
            else
                result[result.lastIndex]!!.end = maxOf(x.end, result[result.lastIndex]!!.end)
        }

        return result
    }
}
