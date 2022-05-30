/*
class Solution {
    fun countOnes(num: Int): Int = num.countOneBits()
}*/

/*
class Solution {
    fun countOnes(num: Int): Int {
        var count = 0

        for (i in 0 until 32)
            if (num.and(1 shl i) != 0)
                count++

        return count
    }
}
*/

class Solution {
    fun countOnes(num: Int): Int =
        (0 until 32).count { num.and(1 shl it) != 0 }
}
