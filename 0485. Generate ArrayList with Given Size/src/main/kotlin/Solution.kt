/*
class Solution {
    fun generate(size: Int): List<Int> = (1..size).toList()
}*/

class Solution {
    fun generate(size: Int): List<Int> {
        val arr = IntArray(size)

        for (i in arr.indices)
            arr[i] = i + 1

        return arr.toList()
    }
}
