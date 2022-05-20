class Solution {
    fun strStr(source: String, target: String): Int {

        for (i in source.indices) {

            var j = 0
            var k = i

            while (j < target.length && source[k] == target[j]) {
                j++
                k++
            }

            if (j == target.length)
                return i
        }

        return -1
    }
}