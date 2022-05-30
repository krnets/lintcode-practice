class Solution {
    fun treePlanning(trees: IntArray, d: Int): Int {
        var prevTree = 0
        var count = 0

        for (i in trees.indices.drop(1)) {
            if (trees[i] - trees[prevTree] < d)
                count++
            else prevTree = i
        }

        return count
    }
}