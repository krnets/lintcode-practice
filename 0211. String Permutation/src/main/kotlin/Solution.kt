class Solution {
    fun permutation(a: String, b: String): Boolean {
        return a.asIterable().sorted() == b.asIterable().sorted()
    }
}