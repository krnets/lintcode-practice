class Solution {
    fun searchInsert(a: IntArray, target: Int): Int {

        for (i in a.indices.drop(1))
            if (a[i - 1] < target && a[i] >= target)
                return i

        return if (a.isNotEmpty() && a.last() < target) a.size else 0
    }
}

/*
class Solution {
    fun searchInsert(a: IntArray, target: Int): Int {
        var low = 0
        var high = a.size - 1
        var ans = a.size

        while (low <= high) {

            val mid = (high - low) / 2 + low

            if (target <= a[mid]) {
                ans = mid
                high = mid - 1
            } else
                low = mid + 1
        }
        return ans
    }
}
*/
