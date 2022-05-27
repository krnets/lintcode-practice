class Solution {
    fun characterGrid(a: String, b: String): List<String> {

        val result = b.indices.map { ".".repeat(a.length).toCharArray() }.toMutableList()
        var rowPos = 0
        var colPos = 0

        for (i in a.indices) {
            var found = false

            for (j in b.indices) {
                if (a[i] == b[j]) {
                    found = true
                    colPos = i
                    rowPos = j
                    break
                }
            }
            if (found) break
        }

        for (j in a.indices)
            result[rowPos][j] = a[j]

        for (i in b.indices)
            result[i][colPos] = b[i]

        return result.map { it.joinToString("") }
    }
}