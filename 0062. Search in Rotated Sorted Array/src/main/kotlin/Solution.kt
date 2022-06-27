class Solution {
    /**
     * @param a: an integer rotated sorted array
     * @param target: an integer to be searched
     */
    fun search(a: IntArray, target: Int): Int {
        var left = 0
        var right = a.lastIndex

        while (left <= right) {

            val mid = left + (right - left) / 2

            if (a[mid] == target) return mid

            if (a[left] <= a[mid]) {

                if (target > a[mid] || target < a[left])
                    left = mid + 1
                else right = mid - 1

            } else {

                if (target < a[mid] || target > a[right])
                    right = mid - 1
                else left = mid + 1
            }
        }

        return -1
    }
}