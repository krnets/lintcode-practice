/*
class Solution {
    fun plusOne(digits: IntArray): IntArray {
        return digits
            .joinToString("")
            .toLong()
            .inc()
            .toString()
            .toCharArray()
            .map { it.digitToInt() }
            .toIntArray()
    }
}*/

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in (digits.size - 1).downTo(0)) {
            if (digits[i] == 9)
                digits[i] = 0
            else {
                digits[i]++
                return digits
            }
        }

        return intArrayOf(1) + digits
    }
}
