class Solution {
    fun isValidTriangle(a: Int, b: Int, c: Int): Boolean {
        return a + b > c && a + c > b && b + c > a
    }
}