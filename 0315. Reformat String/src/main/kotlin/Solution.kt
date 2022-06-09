class Solution {
    fun reformatString(str: String, sublen: IntArray): String {
        var i = 0
        val sub = sublen.map { j -> str.drop(i).take(j).also { i += j } }.toMutableList()
        var k = 0

        while (2 * k + 1 < sub.size) {

            sub[2 * k] = sub[2 * k + 1]
                .also { sub[2 * k + 1] = sub[2 * k] }

            k++
        }

        return sub.joinToString("")
    }
}