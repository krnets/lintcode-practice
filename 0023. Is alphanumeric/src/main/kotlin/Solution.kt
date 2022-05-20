class Solution {
    fun isAlphanumeric(c: Char): Boolean =
        c in 'a'..'z' || c in 'A'..'Z' || c in '0'..'9'
}