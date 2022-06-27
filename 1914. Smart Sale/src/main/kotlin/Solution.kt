class Solution {
    /**
     * @param ids: ID number of items
     * @param m: The largest number of items that can be removed
     * @return: the result of the min item
     */
    fun minItem(ids: List<Int>, m: Int): Int {
        val itemsCount = ids.groupingBy { it }.eachCount().values.sorted()
        var ans = itemsCount.size
        var n = m

        for (x in itemsCount) {
            if (n >= x) {
                ans--
                n -= x
            }
            if (n <= 0)
                break
        }

        return ans
    }
}