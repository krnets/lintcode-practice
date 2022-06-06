class Solution {
    fun calculate(r: Int): DoubleArray {
        val circumference = 2 * Math.PI * r
        val area = Math.PI * r * r

        return doubleArrayOf(circumference, area)
            .map { (it * 100).toInt() / 100.0 }
            .toDoubleArray()
    }
}