class Solution {
    fun insertFive(a: Int): Int {
        var pos = 0
        val str = a.toString()
        val len = str.length

        if (a < 0) {
            pos++
            while (pos < len && str[pos] <= '5') pos++
        } else
            while (pos < len && str[pos] >= '5') pos++

        return (str.take(pos) + '5' + str.drop(pos)).toInt()
    }
}