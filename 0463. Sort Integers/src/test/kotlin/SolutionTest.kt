import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val arr = intArrayOf(3, 2, 1, 4, 5)
        val res = intArrayOf(1, 2, 3, 4, 5)
        Solution().sortIntegers(arr)
        assertArrayEquals(res, arr)
    }

    @Test
    fun BasicTest2() {
        val arr = intArrayOf(1, 1, 2, 1, 1)
        val res = intArrayOf(1, 1, 1, 1, 2)
        Solution().sortIntegers(arr)
        assertArrayEquals(res, arr)
    }
}
