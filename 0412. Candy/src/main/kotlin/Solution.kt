class Solution {
    fun candy(ratings: IntArray): Int {
        val left = IntArray(ratings.size) { 1 }
        val right = IntArray(ratings.size) { 1 }
        var ans = 0

        for (i in left.indices.drop(1))
            if (ratings[i - 1] < ratings[i])
                left[i] = left[i - 1] + 1
            else left[i] = 1

        for (i in (right.lastIndex - 1).downTo(0))
            if (ratings[i] > ratings[i + 1])
                right[i] = right[i + 1] + 1
            else right[i] = 1

        for (i in left.indices)
            ans += maxOf(left[i], right[i])

        return ans
    }
}