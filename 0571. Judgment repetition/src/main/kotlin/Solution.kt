class Solution {
    fun isUnique(arr: IntArray): Boolean {
        val seen = mutableSetOf<Int>()

        for (c in arr) {
            if (seen.contains(c))
                return false

            seen.add(c)
        }

        return true
    }
}