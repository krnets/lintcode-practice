class Solution {
    fun smallestDifference(a: IntArray, b: IntArray): Int {
        a.sort()
        b.sort()

        var i = 0
        var j = 0
        var minDiff = Int.MAX_VALUE

        while (i < a.size && j < b.size) {

            minDiff = minOf(minDiff, Math.abs(a[i] - b[j]))

            if (a[i] < b[j])
                i++
            else j++
        }

        return minDiff
    }
}