class Solution {
    fun maxNonNegativeSubArray(a: IntArray): Int {
        var maxSum = -1
        var curSum = 0

        for (x in a) {
            if (x < 0) {
                curSum = 0
            } else {
                curSum += x
                maxSum = maxOf(maxSum, curSum)
            }
        }

        return maxSum
    }
}