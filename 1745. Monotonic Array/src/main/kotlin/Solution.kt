class Solution {
    fun isMonotonic(a: IntArray): Boolean {
        var isIncreasing: Boolean? = null

        for (i in a.indices.drop(1)) {

            if (a[i - 1] == a[i]) continue

            isIncreasing = if (a[i - 1] < a[i]) {
                when (isIncreasing) {
                    true -> continue
                    null -> true
                    else -> return false
                }
            } else {
                when (isIncreasing) {
                    false -> continue
                    null -> false
                    else -> return false
                }
            }
        }

        return true
    }
}