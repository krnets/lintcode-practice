class Solution {
    fun multiSort(array: Array<IntArray>): Array<IntArray> {
        return array
            .sortedWith(compareByDescending<IntArray> { it.last() }
                .thenBy { it.first() })
            .toTypedArray()
    }
}