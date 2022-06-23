/*
class Solution {
    private val result = mutableListOf<Int>()

    fun combinationSet(digits: List<Int>, target: Int): List<Int> {

        for (d in digits)
            dfs(digits, target, d)

        return result
    }

    private fun dfs(digits: List<Int>, target: Int, current: Int) {
        if (current < target) {
            result.add(current)

            for (d in digits) {
                if (current > 0)
                    dfs(digits, target, 10 * current + d)
            }
        }
    }
}*/

class Solution {
    private val result = mutableListOf<Int>()

    fun combinationSet(digits: List<Int>, target: Int): List<Int> {
        dfs(digits, target, 0)

        return result.sorted()
    }

    private fun dfs(digits: List<Int>, target: Int, current: Int) {
        if (current < target) {
            if (current > 0 || (0 in digits))
                result.add(current)

            for (d in digits)
                if (d != 0 || current != 0)
                    dfs(digits, target, current * 10 + d)
        }
    }
}
