class Solution {
    fun hexConversion(n: Int, k: Int): String {
        var m = n
        val sb = StringBuilder()
        val target = ('0'..'9') + ('A'..'F')

        while (m != 0) {
            val x = target[m % k]
            sb.append(x)
            m /= k
        }

        return if (n == 0) "0" else sb.reversed().toString()
    }
}