class Solution {
    fun dropEggs(n: Int): Int {
        var acc = 0L
        var floor = 0

        while (acc < n) {
            floor++
            acc += floor
        }

        return floor
    }
}