class Solution {
    /**
     * @param a: an integer ratated sorted array and duplicates are allowed
     * @param target: An integer
     * @return: a boolean
     */
    fun search(a: IntArray, target: Int): Boolean {
        var left = 0
        var right = a.lastIndex

        while (left <= right) {
            val mid = left + (right - left) / 2

            if (a[mid] == target) return true

            if (a[mid] < a[right]) {

                if (a[mid] < target && target < a[right])
                    left = mid + 1
                else right = mid - 1

            } else if (a[mid] > a[right]) {

                if (a[mid] > target && target > a[right])
                    right = mid - 1
                else left = mid + 1

            } else right--
        }
        return false
    }
}