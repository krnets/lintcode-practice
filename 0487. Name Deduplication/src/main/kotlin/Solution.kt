class Solution {
    fun nameDeduplication(names: Array<String>): List<String> {
        val seen = mutableSetOf<String>()

        return names
            .map { it.toLowerCase() }
            .filter { name ->
                !seen.contains(name)
                    .also { seen.add(name) }
            }.toList()
    }
}
