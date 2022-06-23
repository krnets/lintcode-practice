class Solution {
    /**
     * @param a: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    fun searchRange(a: IntArray, target: Int): IntArray {
        var low = 0
        var high = a.lastIndex

        while (low <= high) {
            var mid = low + (high - low) / 2

            if (a[mid] == target) {
                var right = mid + 1

                while (right < a.size && a[right] == target) right++

                while (mid >= 0 && a[mid] == target) mid--

                return intArrayOf(mid + 1, right - 1)

            } else if (target < a[mid]) {
                high = mid - 1
            } else low = mid + 1
        }

        return intArrayOf(-1, -1)
    }
}