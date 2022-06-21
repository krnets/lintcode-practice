class Solution {
    fun canConvert(s: String?, t: String): Boolean {
        if (s == null || s.length < t.length) return false

        var i = 0

        for (c in s)
            if (c == t[i]) {
                i++

                if (i == t.length) break
            }

        return i == t.length
    }
}