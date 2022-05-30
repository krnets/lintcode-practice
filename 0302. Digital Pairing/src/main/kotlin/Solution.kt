/*
class Solution {
    fun digitalPairing(nums: IntArray): Int {
        var minSum = Int.MAX_VALUE
        var maxSum = Int.MIN_VALUE
        var i = 0
        var j = nums.size - 1
        val numSorted = nums.sorted()

        while (i < j) {
            val sum = numSorted[i] + numSorted[j]

            minSum = minOf(minSum, sum)
            maxSum = maxOf(maxSum, sum)
            i++
            j--
        }

        return maxSum - minSum
    }
}*/

/*
class Solution {
    fun digitalPairing(nums: IntArray): Int {
        var minSum = Int.MAX_VALUE
        var maxSum = Int.MIN_VALUE
        val n = nums.size
        val numSorted = nums.sorted().toIntArray()

        for (i in 0 until n / 2)
            numSorted[i] += numSorted[n - i - 1]

        for (i in 0 until n / 2) {
            minSum = minOf(minSum, numSorted[i])
            maxSum = maxOf(maxSum, numSorted[i])
        }
        return maxSum - minSum
    }
}
*/

class Solution {
    fun digitalPairing(nums: IntArray): Int {
        var minSum = Int.MAX_VALUE
        var maxSum = Int.MIN_VALUE
        val numSorted = nums.sorted().toIntArray()
        val n = nums.size

        for (i in numSorted.indices) {
            val sum = numSorted[i] + numSorted[n - i - 1]
            minSum = minOf(minSum, sum)
            maxSum = maxOf(maxSum, sum)
        }
        return maxSum - minSum
    }
}
