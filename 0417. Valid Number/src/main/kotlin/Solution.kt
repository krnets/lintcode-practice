class Solution {
    fun isNumber(s: String): Boolean {
        val pattern = """^\s*[-+]?((\d+)|(\d*\.\d+)|(\d+\.)|(\d+e\d+))\s*$""".toRegex()

        return s.matches(pattern)
    }
}

/*
class Solution {
    fun isNumber(s: String): Boolean = s.toDoubleOrNull() != null
}
*/
