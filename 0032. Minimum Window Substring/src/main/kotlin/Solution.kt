class Solution {
    fun minWindow(source: String, target: String): String {

        val map = target.groupingBy { it }.eachCount().toMutableMap()
        var start = 0
        var end = 0
        val countT = target.length
        var countS = 0
        var j = 0
        var windowLength = Int.MAX_VALUE

        for (i in source.indices) {

            while (j < source.length && countS < countT) {

                val rChar = source[j]

                if (rChar in map) {
                    if (map[rChar]!! > 0)
                        countS++

                    map[rChar] = map[rChar]!! - 1
                }
                j++
            }

            if (countS >= countT) {
                if (j - i < windowLength) {
                    start = i
                    end = j
                    windowLength = j - i
                }
            }

            val lChar = source[i]

            if (lChar in map) {
                if (map[lChar]!! >= 0)
                    countS--

                map[lChar] = map[lChar]!! + 1
            }
        }
        return source.substring(start, end)
    }
}
