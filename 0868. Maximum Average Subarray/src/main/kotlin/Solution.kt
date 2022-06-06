/*
class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        return nums.asSequence()
            .windowed(k)
            .map { it.sum().toDouble() / k }
            .maxOf { it }
    }
}*/

/*
class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        val sums = mutableListOf<Double>()
        var curSum = nums.take(k).sum().toDouble()
        sums.add(curSum / k)

        for (i in nums.indices.drop(k)) {
            curSum -= nums[i - k]
            curSum += nums[i]
            sums.add(curSum / k)
        }

        return sums.maxOf { it }
    }
}
*/

class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
        var sum = nums.take(k).sum().toDouble()
        var ans = sum / k

        for (i in nums.indices.drop(k)) {
            sum -= nums[i - k]
            sum += nums[i]
            ans = maxOf(ans, sum / k)
        }

        return ans
    }
}
