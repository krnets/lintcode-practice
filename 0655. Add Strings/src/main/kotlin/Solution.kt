class Solution {
    fun addStrings(num1: String, num2: String): String {
        val sb = StringBuilder()
        var i = num1.lastIndex
        var j = num2.lastIndex
        var carry = 0

        while (i >= 0 && j >= 0) {
            val x = (num1[i] - '0') + (num2[j] - '0') + carry
            carry = if (x > 9) 1 else 0
            sb.append(if (x > 9) x - 10 else x)
            i--
            j--
        }

        while (i >= 0) {
            val x = num1[i] - '0' + carry
            carry = if (x > 9) 1 else 0
            sb.append(if (x > 9) x - 10 else x)
            i--
        }

        while (j >= 0) {
            val x = num2[j] - '0' + carry
            carry = if (x > 9) 1 else 0
            sb.append(if (x > 9) x - 10 else x)
            j--
        }
        if (carry == 1)
            sb.append(1)

        return sb.reverse().toString()
    }
}