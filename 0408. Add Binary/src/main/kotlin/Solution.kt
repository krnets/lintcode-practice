/*
class Solution {
    fun addBinary(a: String, b: String): String {
        val sb = StringBuilder()
        var i = 0
        var j = 0
        val m = a.length
        val n = b.length
        var carry = 0

        while (i < a.length && j < b.length) {
            val x = (a[m - i - 1] - '0') + (b[n - j - 1] - '0') + carry
            carry = if (x > 1) 1 else 0
            sb.insert(0, if (x % 2 == 0) 0 else 1)
            i++
            j++
        }

        while (i < a.length) {
            val x = (a[m - i - 1] - '0') + carry
            carry = if (x > 1) 1 else 0
            sb.insert(0, if (x % 2 == 0) 0 else 1)
            i++
        }

        while (j < b.length) {
            val x = (b[n - j - 1] - '0') + carry
            carry = if (x > 1) 1 else 0
            sb.insert(0, if (x % 2 == 0) 0 else 1)
            j++
        }

        if (carry == 1) sb.insert(0, 1)

        return sb.toString()
    }
}*/

/*
class Solution {
    fun addBinary(a: String, b: String): String {
        val sb = StringBuilder()
        var i = a.lastIndex
        var j = b.lastIndex
        var carry = 0

        while (i >= 0 && j >= 0) {
            val x = (a[i] - '0') + (b[j] - '0') + carry
            carry = if (x > 1) 1 else 0
            sb.insert(0, if (x % 2 == 0) 0 else 1)
            i--
            j--
        }

        while (i >= 0) {
            val x = (a[i] - '0') + carry
            carry = if (x > 1) 1 else 0
            sb.insert(0, if (x % 2 == 0) 0 else 1)
            i--
        }

        while (j >= 0) {
            val x = (b[j] - '0') + carry
            carry = if (x > 1) 1 else 0
            sb.insert(0, if (x % 2 == 0) 0 else 1)
            j--
        }

        if (carry == 1) sb.insert(0, 1)

        return sb.toString()
    }
}
*/

class Solution {
    fun addBinary(a: String, b: String): String {
        val sb = StringBuilder()
        var i = a.lastIndex
        var j = b.lastIndex
        var carry = 0

        while (i >= 0 && j >= 0) {
            val x = (a[i] - '0') + (b[j] - '0') + carry
            carry = if (x > 1) 1 else 0
            sb.append(if (x % 2 == 0) 0 else 1)
            i--
            j--
        }

        while (i >= 0) {
            val x = (a[i] - '0') + carry
            carry = if (x > 1) 1 else 0
            sb.append(if (x % 2 == 0) 0 else 1)
            i--
        }

        while (j >= 0) {
            val x = (b[j] - '0') + carry
            carry = if (x > 1) 1 else 0
            sb.append(if (x % 2 == 0) 0 else 1)
            j--
        }

        if (carry == 1) sb.append(1)

        return sb.reverse().toString()
    }
}
