class Solution {
    /**
     * @param s: a string
     * @return: the starting and ending positions of every large group
     */
    fun largeGroupPositions(s: String): List<IntArray> {
        val groups: Map<Char, List<Char>> = s.groupBy { it }
        val result = mutableListOf<IntArray>()
        var i = 0

        for (g in groups) {

            if (g.value.size >= 3) {
                result.add(intArrayOf(i, i + g.value.size - 1))
            }

            i += g.value.size
        }

        return result
    }
}