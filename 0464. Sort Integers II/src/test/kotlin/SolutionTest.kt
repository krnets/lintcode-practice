import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val arr = intArrayOf(3, 2, 1, 4, 5)
        Solution().sortIntegers2(arr)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), arr)
    }

    @Test
    fun BasicTest2() {
        val arr = intArrayOf(2, 3, 1)
        Solution().sortIntegers2(arr)
        assertArrayEquals(intArrayOf(1, 2, 3), arr)
    }

    @Test
    fun BasicTest3() {
        val arr = intArrayOf(12, 11, 13, 5, 6, 7)
        Solution().sortIntegers2(arr)
        assertArrayEquals(intArrayOf(5, 6, 7, 11, 12, 13), arr)
    }
}
