class Solution {
    fun validWordSquare(words: Array<String>): Boolean {
        if (words.size != words.first().length) return false

        for (i in words.indices) {
            for (j in words[i].indices) {
                if (j >= words.size || i >= words[j].length || words[i][j] != words[j][i])
                    return false
            }
        }

        return true
    }
}
