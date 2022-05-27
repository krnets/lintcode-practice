class Solution {
    fun urlencode(baseUrl: String, queryParamsList: List<List<String>>): String {
        val urlSuffix = queryParamsList
            .sortedBy { it.first() }
            .joinToString("&") {
                it.joinToString("=")
            }

        return if (urlSuffix.isEmpty()) baseUrl else "$baseUrl?$urlSuffix"
    }
}