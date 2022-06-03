class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        return s.asIterable().sorted() == t.asIterable().sorted()
    }
}