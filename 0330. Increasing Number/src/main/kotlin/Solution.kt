class Solution {
    fun getIncreasingNumber(n: Long): Long {
        if (n < 10) return n - 1

        val digits = n.toString()
        val len = digits.length
        var pos = 0
        val sb = StringBuilder()

        for (i in digits.indices.drop(1))
            when {
                digits[i] - digits[i - 1] > 1 -> pos = i
                digits[i] <= digits[i - 1] -> break
            }

        for (j in 0 until pos)
            sb.append(digits[j])

        sb.append(minOf(10 - (len - pos), digits[pos] - '0' - 1))
        var start = 11 - (len - pos)

        for (j in pos + 1 until len) {
            sb.append(start)
            start++
        }

        return sb.toString().toLong()
    }
}