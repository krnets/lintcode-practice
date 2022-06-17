class Solution {
    fun pickCarrots(carrot: Array<IntArray>): Int {
        val n = carrot.size
        val m = carrot.first().size
        var i = (n - 1) / 2
        var j = (m - 1) / 2
        var sum = carrot[i][j]
        val visited = Array(n) { BooleanArray(m) }
        visited[i][j] = true

        while (true) {

            val up = if (i - 1 >= 0 && !visited[i - 1][j]) carrot[i - 1][j] else Int.MIN_VALUE
            val down = if (i + 1 < n && !visited[i + 1][j]) carrot[i + 1][j] else Int.MIN_VALUE
            val left = if (j - 1 >= 0 && !visited[i][j - 1]) carrot[i][j - 1] else Int.MIN_VALUE
            val right = if (j + 1 < m && !visited[i][j + 1]) carrot[i][j + 1] else Int.MIN_VALUE

            sum += if (up > down && up > left && up > right) up.also { i-- }
            else if (down > up && down > left && down > right) down.also { i++ }
            else if (left > up && left > right && left > down) left.also { j-- }
            else if (right > up && right > left && right > down) right.also { j++ }
            else break

            visited[i][j] = true
        }

        return sum
    }
}
