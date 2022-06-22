class Solution {
    fun maxDistToClosest(seats: IntArray): Int {
        var ans = 0
        var i = 0

        for (j in seats.indices) {

            if (seats[j] == 1) {

                ans = if (i == 0) j else maxOf(ans, (j - i + 1) / 2)

                i = j + 1
            }
        }

        return maxOf(ans, seats.size - i)
    }
}