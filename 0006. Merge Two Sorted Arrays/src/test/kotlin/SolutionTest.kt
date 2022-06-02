import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val a = intArrayOf(1)
        val b = intArrayOf(1)
        assertContentEquals(intArrayOf(1, 1), Solution().mergeSortedArray(a, b))
    }

    @Test
    fun BasicTest2() {
        val a = intArrayOf(1, 2, 3, 4)
        val b = intArrayOf(2, 4, 5, 6)
        assertContentEquals(intArrayOf(1, 2, 2, 3, 4, 4, 5, 6), Solution().mergeSortedArray(a, b))
    }

    @Test
    fun BasicTest3() {
        val a = intArrayOf(1, 3, 5)
        val b = intArrayOf(4)
        assertContentEquals(intArrayOf(1, 3, 4, 5), Solution().mergeSortedArray(a, b))
    }
}
