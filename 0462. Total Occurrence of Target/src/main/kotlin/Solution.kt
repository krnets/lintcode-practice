class Solution {
    fun totalOccurrence(a: IntArray, target: Int): Int {
        var count = 0
        var low = 0
        var high = a.size - 1

        while (low < high) {
            var mid = low + (high - low) / 2

            if (a[mid] == target) {
                count = 1
                var i = mid - 1
                mid++

                while (i >= 0 && a[i] == target) {
                    count++
                    i--
                }
                while (mid < a.size && a[mid] == target) {
                    count++
                    mid++
                }
                break
            }
            if (a[mid] > target)
                high = mid
            else low = mid + 1
        }

        return count
    }
}