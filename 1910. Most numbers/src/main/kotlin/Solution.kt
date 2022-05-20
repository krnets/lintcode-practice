/*
class Solution {
    fun findNumber(array: IntArray): Int {
        val largestNumber = array.maxOf { it }
        val numCount = IntArray(largestNumber + 1)

        for (x in array)
            numCount[x]++

        val most = numCount.maxOf { it }

        for (i in numCount.indices)
            if (numCount[i] == most)
                return i

        return 0
    }
}*/

class Solution {
    fun findNumber(array: IntArray): Int {
        val counter = mutableMapOf<Int, Int>()
        var max = 0
        var ans = 0

        for (x in array) {
            counter[x] = 1 + counter.getOrDefault(x, 0)

            if (counter[x]!! > max) {
                max = counter[x]!!
                ans = x
            } else if (counter[x] == max && x < ans)
                ans = x
        }

        return ans
    }
}
