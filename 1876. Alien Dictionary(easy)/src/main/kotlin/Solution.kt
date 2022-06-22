class Solution {
    /**
     * @param words: the array of string means the list of words
     * @param order: a string indicate the order of letters
     * @return: return true or false
     */
    fun isAlienSorted(words: Array<String>, order: String): Boolean {

        val alienCharMap = order.withIndex().associate {
            it.value to 'a' + it.index
        }

        val arr = words.map { w ->
            w.map { c -> alienCharMap[c] }.joinToString("")
        }

        return arr.indices.drop(1).none { i -> arr[i - 1] > arr[i] }
    }
}