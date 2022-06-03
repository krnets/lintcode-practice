/*
class Solution {
    fun isPalindrome(num: Int): Boolean {
        return num.toString() == num.toString().reversed()
    }
}*/

/*
class Solution {
    fun isPalindrome(num: Int): Boolean {
        var k = 0
        var m = num

        while (m != 0) {
            k = 10 * k + m % 10
            m /= 10
        }

        return k == num
    }
}
*/

/*
class Solution {
    fun isPalindrome(num: Int): Boolean {
        val str = num.toString()
        val half = str.length / 2

        return str.take(half) == str.takeLast(half).reversed()
    }
}
*/

class Solution {
    fun isPalindrome(num: Int): Boolean {
        if (num % 10 == 0 && num != 0) return false

        var m = num
        var k = 0

        while (m > k) {
            k = 10 * k + m % 10
            m /= 10
        }
        return m == k || m == k / 10
    }
}
