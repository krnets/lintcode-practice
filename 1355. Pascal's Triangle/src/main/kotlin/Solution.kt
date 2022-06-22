class Solution {
    /**
     * @param numRows: num of rows
     * @return: generate Pascal's triangle
     */
    fun generate(numRows: Int): List<IntArray> {
        val triangle = List(numRows) { IntArray(it + 1) }

        for (i in 0 until numRows) {
            triangle[i][0] = 1
            triangle[i][i] = 1

            for (j in 1 until i)
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]
        }

        return triangle
    }
}