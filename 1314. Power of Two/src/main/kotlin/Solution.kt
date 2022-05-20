/*
class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        return n.countOneBits() == 1
    }
}*/

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        return n and (n - 1) == 0
    }
}
