/*
class Solution {
    fun leftRotate(n: Int, d: Int): Int {
        return n shl d
    }
}*/

class Solution {
    fun leftRotate(n: Int, d: Int): Int {
        var binary = n.toString(2)
        binary = binary.padEnd(binary.length + d, '0')

        return Integer.parseInt(binary, 2)
    }
}
