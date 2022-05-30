class Solution {
    fun largestLetter(s: String): String {
        val charSet = s.toSet()
        var result = "NO"
        val (lower, _) = s.partition { it.isUpperCase() }

        for (c in lower.asIterable().sorted())
            if (charSet.contains(c.toLowerCase()))
                result = "$c"

        return result
    }
}