class Solution {
    fun findLetter(str: String): Char {
        val arr = IntArray(128)

        for (c in str)
            arr[c.toInt()]++

        for (c in 'Z'.downTo('A'))
            if (arr[c.toInt()] > 0 && arr[c.toInt() + 32] > 0)
                return c

        return '~'
    }
}