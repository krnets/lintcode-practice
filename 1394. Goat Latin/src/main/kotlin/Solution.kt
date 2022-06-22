class Solution {
    fun toGoatLatin(s: String): String {
        return s.split(" ").withIndex().joinToString(" ") {
            if ("aeiou".contains(it.value.first().toLowerCase()))
                it.value + "ma" + "a".repeat(it.index + 1)
            else
                it.value.drop(1) + it.value.first() + "ma" + "a".repeat(it.index + 1)
        }
    }
}