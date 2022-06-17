class Solution {
    fun totalCost(cost: List<IntArray>): Int {
        val half = cost.size / 2

        val sortedList = cost.sortedWith { a, b ->
            (a.first() - a.last()) - (b.first() - b.last())
        }

        return sortedList.take(half).map { it.first() }
            .zip(sortedList.drop(half).map { it.last() })
            .sumOf { it.first + it.second }
    }
}