class Solution {
    fun isLeapYear(n: Int): Boolean {
        return (n % 4 == 0 && n % 100 != 0) || n % 400 == 0
    }
}