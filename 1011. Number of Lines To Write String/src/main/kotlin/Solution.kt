class Solution {
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        val maxWidth = 100
        var lines = 1
        var currWidth = 0

        for (c in s) {
            val need = widths[c - 'a']
            currWidth += need

            if (currWidth > maxWidth) {
                currWidth = need
                lines++
            }
        }

        return intArrayOf(lines, currWidth)
    }
}