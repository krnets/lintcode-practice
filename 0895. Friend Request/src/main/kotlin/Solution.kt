class Solution {
    fun friendRequest(ages: IntArray): Int {
        var count = 0

        for (i in ages.indices) {
            for (j in ages.indices) {

                val A = ages[i]
                val B = ages[j]

                if (i == j || B > A || (B < 100 && A > 100) || B <= (A / 2 + 7))
                    continue

                count++
            }
        }

        return count
    }
}