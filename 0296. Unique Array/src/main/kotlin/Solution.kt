class Solution {
    fun getUniqueArray(arr: IntArray): IntArray {
        val seen = mutableSetOf<Int>()
        val result = mutableListOf<Int>()

        for (x in arr) {
            if (!seen.contains(x))
                result.add(x)

            seen.add(x)
        }

        return result.toIntArray()
    }
}