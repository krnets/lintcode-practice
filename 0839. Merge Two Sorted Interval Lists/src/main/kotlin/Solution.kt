class Interval(var start: Int, var end: Int) {}

/*
class Solution {
    fun mergeTwoInterval(list1: List<Interval?>, list2: List<Interval?>): List<Interval?> {
        if (list1.isEmpty()) return list2
        if (list2.isEmpty()) return list1

        var i = 0
        var j = 0

        var now: Interval?
        val res = mutableListOf<Interval>()

        while (i < list1.size && j < list2.size) {

            val a = list1[i]
            val b = list2[j]

            if (a!!.start <= b!!.start) {
                now = a
                i++
            } else {
                now = b
                j++
            }

            if (res.isEmpty()) {
                res.add(now)
            } else {
                merge(res, res.last(), now)
            }
        }

        while (i < list1.size)
            merge(res, res.last(), list1[i++])

        while (j < list2.size)
            merge(res, res.last(), list2[j++])

        return res
    }

    private fun merge(res: MutableList<Interval>, last: Interval?, now: Interval?) {
        if (last!!.end < now!!.start)
            res.add(now)
        else
            last.end = maxOf(last.end, now.end)
    }
}
*/

class Solution {
    fun mergeTwoInterval(list1: List<Interval?>, list2: List<Interval?>): List<Interval?> {
        if (list1.isEmpty()) return list2
        if (list2.isEmpty()) return list1

        var i = 0
        var j = 0
        val res = mutableListOf<Interval?>()

        while (i < list1.size && j < list2.size) {

            if (list1[i]!!.start <= list2[j]!!.start)
                mergeInterval(res, list1[i++])
            else mergeInterval(res, list2[j++])
        }

        while (i < list1.size) mergeInterval(res, list1[i++])
        while (j < list2.size) mergeInterval(res, list2[j++])

        return res
    }

    private fun mergeInterval(res: MutableList<Interval?>, t: Interval?) {
        if (res.isEmpty()) {
            res.add(t)
            return
        }
        val cur = res.last()

        if (cur!!.end < t!!.start)
            res.add(t)
        else
            cur.end = maxOf(cur.end, t.end)
    }
}
