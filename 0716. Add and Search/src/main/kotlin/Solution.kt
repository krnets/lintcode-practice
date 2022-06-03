class Solution {
    fun addAndSearch(inputs: IntArray, tests: IntArray): Boolean {
        for (i in 0 until inputs.lastIndex) {
            val x = inputs[i]

            for (j in i + 1 until inputs.size) {
                val y = x + inputs[j]

                if (tests.contains(y))
                    return true
            }
        }
        return false
    }
}