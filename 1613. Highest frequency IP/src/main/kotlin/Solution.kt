class Solution {
    fun highestFrequency(ipLines: Array<String>): String {
        return ipLines
            .groupingBy { it }
            .eachCount()
            .entries.maxByOrNull { it.value }!!
            .key
    }
}