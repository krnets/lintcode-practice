class Solution {
    fun shortestUnorderedArray(arr: IntArray): Int {
        var isNonDecreasing = false

        for (i in arr.indices.drop(1)) {
            if (arr[i - 1] <= arr[i]) {
                isNonDecreasing = true
            } else {
                isNonDecreasing = false
                break
            }
        }

        return if (isNonDecreasing) 0 else 3
    }
}