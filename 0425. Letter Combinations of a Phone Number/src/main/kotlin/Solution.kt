class Solution {
    private val buttons = arrayOf("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
    private val combinations = mutableListOf<String>()

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return combinations

        backTrack(digits, 0, StringBuilder())

        return combinations
    }

    private fun backTrack(digits: String, index: Int, path: StringBuilder) {
        if (path.length == digits.length) {
            combinations.add(path.toString())
            return
        }

        for (c in buttons[digits[index] - '0']) {
            path.append(c)
            backTrack(digits, index + 1, path)
            path.deleteCharAt(path.lastIndex)
        }
    }
}

