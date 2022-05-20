import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val a = intArrayOf(1)
        val b = intArrayOf(1)
        assertArrayEquals(intArrayOf(1, 1), Solution().mergeSortedArray(a, b))
    }

    @Test
    fun BasicTest2() {
        val a = intArrayOf(1, 2, 3, 4)
        val b = intArrayOf(2, 4, 5, 6)
        assertArrayEquals(intArrayOf(1, 2, 2, 3, 4, 4, 5, 6), Solution().mergeSortedArray(a, b))
    }

    @Test
    fun BasicTest3() {
        val a = intArrayOf(1, 3, 5)
        val b = intArrayOf(4)
        assertArrayEquals(intArrayOf(1, 3, 4, 5), Solution().mergeSortedArray(a, b))
    }
}
