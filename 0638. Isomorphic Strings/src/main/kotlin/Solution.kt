class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Char>()

        for (i in s.indices) {

            if (map.containsKey(s[i])) {
                if (map[s[i]] != t[i])
                    return false

            } else {
                map[s[i]] = t[i]
            }
        }

        return map.values.distinct().count() == map.size
    }
}