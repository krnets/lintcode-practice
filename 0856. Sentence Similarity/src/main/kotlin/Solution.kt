class Solution {
    fun isSentenceSimilarity(words1: Array<String>, words2: Array<String>, pairs: List<MutableList<String>>): Boolean {
        if (words1.size != words2.size) return false

        val map = mutableMapOf<String, MutableList<String>>()

        for ((first, second) in pairs) {
            if (map.containsKey(first)) map[first]!!.add(second)
            else map[first] = mutableListOf(second)

            if (map.containsKey(second)) map[second]!!.add(first)
            else map[second] = mutableListOf(first)
        }

        for (i in words1.indices) {
            val a = words1[i]
            val b = words2[i]

            if (a != b && !map[a]!!.contains(b))
                return false
        }

        return true
    }
}