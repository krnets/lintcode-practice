class Solution {
    fun anagrams(strs: Array<String>): List<String> {
        val list = mutableListOf<String>()
        val map = mutableMapOf<List<Char>, Int>()

        for (s in strs) {
            val t = s.asIterable().sorted()
            map[t] = 1 + map.getOrDefault(t, 0)
        }
        for (s in strs) {
            val t = s.asIterable().sorted()

            if (map[t]!! > 1) list.add(s)
        }
        return list
    }
}