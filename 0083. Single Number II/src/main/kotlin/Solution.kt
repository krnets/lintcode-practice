/*
class Solution {
    fun singleNumberII(a: IntArray): Int = a.asSequence()
        .groupingBy { it }
        .eachCount()
        .entries
        .first { it.value == 1 }
        .key
}*/

class Solution {
    fun singleNumberII(a: IntArray): Int {
        var ones = 0
        var twos = 0

        for (num in a) {
            ones = ones xor num and twos.inv()
            twos = twos xor num and ones.inv()
        }
        return ones
    }
}
