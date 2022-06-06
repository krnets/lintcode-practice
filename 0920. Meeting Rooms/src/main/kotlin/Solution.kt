class Interval(var start: Int, var end: Int) {}

/*
class Solution {
    fun canAttendMeetings(intervals: List<Interval?>): Boolean {
        val sortedIntervals = intervals.sortedWith(compareBy { it!!.start })

        for (i in sortedIntervals.indices.drop(1))
            if (sortedIntervals[i]!!.start < sortedIntervals[i - 1]!!.end)
                return false

        return true
    }
}*/

/*
class Solution {
    fun canAttendMeetings(intervals: List<Interval?>): Boolean {
        val sortedIntervals = intervals.sortedBy { it!!.start }

        for (i in sortedIntervals.indices.drop(1))
            if (sortedIntervals[i]!!.start < sortedIntervals[i - 1]!!.end)
                return false

        return true
    }
}
*/

/*
class Solution {
    fun canAttendMeetings(intervals: List<Interval?>): Boolean {
        val sortedIntervals = intervals.sortedBy { it!!.start }

        return sortedIntervals.indices.drop(1)
            .none { i -> sortedIntervals[i]!!.start < sortedIntervals[i - 1]!!.end }
    }
}
*/

/*
class Solution {
    fun canAttendMeetings(intervals: List<Interval?>): Boolean {
        val sortedIntervals = intervals.sortedBy { it!!.start }

        return sortedIntervals.zip(sortedIntervals.drop(1))
            .none { it.first!!.end > it.second!!.start }
    }
}
*/

class Solution {
    fun canAttendMeetings(intervals: List<Interval?>): Boolean {
        val sortedIntervals = intervals.sortedBy { it!!.start }

        return sortedIntervals.zip(sortedIntervals.drop(1))
            .all { it.first!!.end <= it.second!!.start }
    }
}
