class Solution {
    fun rotateString(s: CharArray, offset: Int): Unit {
        if (s.isEmpty()) return

        reverse(s, 0, s.size - 1)
        reverse(s, 0, offset % s.size - 1)
        reverse(s, offset % s.size, s.size - 1)
    }

    private fun reverse(chars: CharArray, start: Int, end: Int) {
        var left = start
        var right = end

        while (left <= right) {
            chars[left] = chars[right].also { chars[right] = chars[left] }
            left++
            right--
        }
    }
}