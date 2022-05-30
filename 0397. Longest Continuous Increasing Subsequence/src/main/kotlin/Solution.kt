class Solution {
    fun longestIncreasingContinuousSubsequence(a: IntArray): Int {
        var currLength = if (a.isEmpty()) 0 else 1
        var maxLength = currLength

        for (i in a.indices.drop(1)) {

            if (a[i - 1] < a[i]) {
                currLength++
                maxLength = maxOf(maxLength, currLength)
            } else
                currLength = 1
        }
        currLength = 1

        for (i in (a.size - 1).downTo(1)) {

            if (a[i - 1] > a[i]) {
                currLength++
                maxLength = maxOf(maxLength, currLength)
            } else
                currLength = 1
        }

        return maxLength
    }
}