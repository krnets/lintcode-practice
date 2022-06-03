class Solution {
    fun isStrobogrammatic(num: String): Boolean {
        var left = 0
        var right = num.lastIndex
        val map = mapOf('6' to '9', '9' to '6')

        while (left < right) {
            val x = num[left]

            if (x != num[right] && map[x] != num[right])
                return false

            left++
            right--
        }
        return (left > right) or "180".contains(num[left])
    }
}