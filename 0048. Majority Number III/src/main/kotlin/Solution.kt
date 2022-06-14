class Solution {
    fun majorityNumber(nums: List<Int>, k: Int): Int {
        val elements = IntArray(k)
        val votes = IntArray(k)

        outer@ for (x in nums) {

            for (i in votes.indices) {

                if (votes[i] == 0) {
                    elements[i] = x
                    votes[i]++
                    continue@outer
                } else if (votes[i] > 0 && x == elements[i]) {
                    votes[i]++
                    continue@outer
                }
            }

            for (j in votes.indices)
                votes[j]--
        }
        val counts = IntArray(k)

        for (x in nums)
            for (i in votes.indices)
                if (votes[i] > 0 && x == elements[i])
                    counts[i]++

        for (i in counts.indices)
            if (counts[i] > nums.size / k)
                return elements[i]

        return -1
    }
}