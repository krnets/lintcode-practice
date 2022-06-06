class Solution {
    fun calcYangHuisTriangle(n: Int): List<IntArray> {
        val result = mutableListOf<IntArray>()

        for (i in 0 until n) {
            val arr = IntArray(i + 1)
            arr[0] = 1
            arr[i] = 1

            for (j in 1 until i) {
                val x = result[i - 1][j - 1]
                val y = result[i - 1][j]
                arr[j] = x + y
            }

            result.add(arr)
        }

        return result
    }
}