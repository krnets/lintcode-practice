class Solution {
    fun concatenetedString(s1: String, s2: String): String {
        val commonChars = s1.toSet().intersect(s2.toSet())

        return s1.filterNot { it in commonChars } + s2.filterNot { it in commonChars }
    }
}