/*
class Solution {
    fun arrangeCoins(n: Int): Int {
        var m = n
        var level = 1

        while (m > 0) {
            level++
            m -= level
        }

        return level - 1
    }
}*/

/*
class Solution {
    fun arrangeCoins(n: Int): Int {
        return (-0.5 + Math.sqrt((2.0 * n) + 0.25)).toInt()
    }
}
*/

/*
class Solution {
    fun arrangeCoins(n: Int): Int {
        return (Math.sqrt((2.0 * n) + 0.25) - 0.5).toInt()
    }
}
*/

class Solution {
    fun arrangeCoins(n: Int): Int {
        var l = 0L
        val m = n.toLong()
        var r = m

        while (l <= r) {
            val pivot = l + (r - l) / 2
            val coinsFilled = pivot * (pivot + 1) / 2

            if (coinsFilled == m)
                r = coinsFilled

            if (n < coinsFilled)
                r = pivot - 1
            else l = pivot + 1
        }

        return r.toInt()
    }
}

/*
class Solution {
    fun arrangeCoins(n: Int): Int {

        var mask: Long = 1 shl 15
        var result = 0L

        while (mask > 0) {

            result = result or mask

            if (result * (result + 1) / 2 > n) {
                result = result xor mask
            }

            mask = mask shr 1
        }

        return result.toInt()
    }
}
*/
