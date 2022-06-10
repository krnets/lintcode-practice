/*
class Solution {
    fun maximumGap(nums: IntArray): Int {
        if (nums.size < 2) return 0

        var maxGap = 0
        nums.sort()

        for (i in nums.indices.drop(1))
            maxGap = maxOf(maxGap, nums[i] - nums[i - 1])

        return maxGap
    }
}*/

class Bucket {
    var used = false
    var minVal = Int.MAX_VALUE
    var maxVal = Int.MIN_VALUE
}

class Solution {
    fun maximumGap(nums: IntArray): Int {
        if (nums.size < 2) return 0

        val min = nums.minOf { it }
        val max = nums.maxOf { it }

        val bucketSize = maxOf(1, (max - min) / (nums.size - 1))
        val bucketNum = (max - min) / bucketSize + 1
        val buckets = Array(bucketNum) { Bucket() }

        for (x in nums) {
            val index = (x - min) / bucketSize
            buckets[index].used = true
            buckets[index].minVal = minOf(x, buckets[index].minVal)
            buckets[index].maxVal = maxOf(x, buckets[index].maxVal)
        }

        var maxGap = 0
        var prevMaxGap = min

        for (b in buckets)
            if (b.used) {
                maxGap = maxOf(maxGap, b.minVal - prevMaxGap)
                prevMaxGap = b.maxVal
            }

        return maxGap
    }
}
