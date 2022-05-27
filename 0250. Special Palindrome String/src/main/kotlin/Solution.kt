class Solution {
    fun ispalindrome(ambigram: List<String>, word: String): Boolean {
        val charMap = mutableMapOf<Char, MutableSet<Char>>()

        ambigram.forEach {
            val a = it.first()
            val b = it.last()

            if (charMap.containsKey(a)) charMap[a]!!.add(b)
            else charMap[a] = mutableSetOf(b)

            if (charMap.containsKey(b)) charMap[b]!!.add(a)
            else charMap[b] = mutableSetOf(a)
        }

        return word.take(word.length / 2)
            .zip(word.reversed())
            .all { (l, r) ->
                (l == r) or
                        (charMap.containsKey(l) && charMap[l]!!.contains(r)) or
                        (charMap.containsKey(r) && charMap[r]!!.contains(l)) or
                        (charMap.containsKey(l) && charMap.containsKey(r) &&
                                charMap[l]!!.intersect(charMap[r]!!).isNotEmpty())
            }
    }
}