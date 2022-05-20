class Solution {
    fun swapIntegers(a: IntArray, index1: Int, index2: Int): Unit {

        a[index1] = a[index2].also {
            a[index2] = a[index1]
        }
    }
}