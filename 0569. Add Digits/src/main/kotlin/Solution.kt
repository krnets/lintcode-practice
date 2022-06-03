/*
class Solution {
    fun addDigits(num: Int): Int {
        var m = num

        while (m >= 10) {
            var x = 0

            while (m != 0) {
                x += m % 10
                m /= 10
            }
            m = x
        }
        return m
    }
}*/

class Solution {
    fun addDigits(num: Int): Int {
        return (num - 1) % 9 + 1
    }
}
