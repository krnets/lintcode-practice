class Solution {
    fun squareArray(a: IntArray): IntArray =
        a.map { it * it }.sorted().toIntArray()
}