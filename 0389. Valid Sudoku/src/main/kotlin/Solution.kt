class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val set = mutableSetOf<Char>()
        val n = 9

        for (i in 0 until n) {
            for (j in 0 until n) {

                val c = board[i][j]
                if (c == '.') continue

                if (set.contains(c))
                    return false

                set.add(c)
            }
            set.clear()
        }

        for (j in 0 until n) {
            for (i in 0 until n) {

                val c = board[i][j]
                if (c == '.') continue

                if (set.contains(c))
                    return false

                set.add(c)
            }
            set.clear()
        }

        for (k in 0 until 3) {
            for (m in 0 until 3) {
                for (i in 0 until 3) {
                    for (j in 0 until 3) {

                        val c = board[i + 3 * k][j + 3 * m]

                        if (c == '.') continue

                        if (set.contains(c))
                            return false

                        set.add(c)
                    }
                }
                set.clear()
            }
        }

        return true
    }
}