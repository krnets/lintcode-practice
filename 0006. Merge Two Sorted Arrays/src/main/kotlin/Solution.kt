/*
class Solution {
    fun mergeSortedArray(a: IntArray, b: IntArray): IntArray {
        var ia = 0
        var ib = 0
        val res = IntArray(a.size + b.size)

        for (i in res.indices) {

            var c = 0

            if (ia == a.size)
                c = b[ib++]
            else if (ib == b.size)
                c = a[ia++]
            else if (a[ia] < b[ib])
                c = a[ia++]
            else if (b[ib] <= a[ia])
                c = b[ib++]

            res[i] = c
        }

        return res
    }
}*/

class Solution {
    fun mergeSortedArray(a: IntArray, b: IntArray): IntArray {
        var ia = 0
        var ib = 0
        val res = IntArray(a.size + b.size)

        for (i in res.indices) {

            res[i] = when {
                ia == a.size -> b[ib++]
                ib == b.size -> a[ia++]
                a[ia] < b[ib] -> a[ia++]
                else -> b[ib++]
            }
        }

        return res
    }
}

