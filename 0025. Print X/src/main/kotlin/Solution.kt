class Solution {
    fun printX(n: Int): List<String> {
        val ans = mutableListOf<String>()

        for (i in 0 until n) {

            val chars = CharArray(n) { ' ' }
            chars[i] = 'X'
            chars[n - i - 1] = 'X'

            ans.add(chars.joinToString(""))
        }

        return ans
    }
}