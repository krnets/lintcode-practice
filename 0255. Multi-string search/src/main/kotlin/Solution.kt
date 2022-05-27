class Solution {
    fun whetherStringsAreSubstrings(sourceString: String, targetStrings: Array<String>): BooleanArray =
        targetStrings.map { sourceString.contains(it) }.toBooleanArray()
}