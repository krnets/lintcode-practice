class Solution {
    fun getAns(a: IntArray, q: Array<IntArray>): IntArray {
        val result = mutableListOf<Int>()

        for ((l, r) in q) {
            var count = 0

            for (x in a)
                if (x in l..r)
                    count++

            result.add(count)
        }

        return result.toIntArray()
    }
}