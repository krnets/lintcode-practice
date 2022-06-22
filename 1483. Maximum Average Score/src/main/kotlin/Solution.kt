class Solution {
    fun maximumAverageScore(names: List<String>, grades: IntArray): Double {
        val map = mutableMapOf<String, MutableList<Int>>()

        for (i in names.indices) {
            if (map.containsKey(names[i])) {
                map[names[i]]!!.add(grades[i])
            } else
                map[names[i]] = mutableListOf(grades[i])
        }

        return map.values.maxOfOrNull { it.sum().toDouble() / it.size } ?: 0.0
    }
}