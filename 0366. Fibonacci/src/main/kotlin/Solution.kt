class Solution {
    fun fibonacci(n: Int): Int {
        var a = 0
        var b = 1

        for (i in 1 until n)
            a = b.also { b += a }
        
        return a
    }
}