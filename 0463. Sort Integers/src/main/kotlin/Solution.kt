class Solution {
    fun sortIntegers(a: IntArray): Unit {
        val n = a.size

        for (i in 0 until n - 1)
            for (j in i + 1 until n)
                if (a[i] > a[j])
                    a[i] = a[j].also { a[j] = a[i] }
    }
}