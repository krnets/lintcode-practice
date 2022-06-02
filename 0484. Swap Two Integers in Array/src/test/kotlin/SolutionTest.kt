import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val arr = intArrayOf(1, 2, 3, 4)
        val res = intArrayOf(1, 2, 4, 3)
        Solution().swapIntegers(arr, 2, 3)
        assertContentEquals(res, arr)
    }

    @Test
    fun BasicTest2() {
        val arr = intArrayOf(1, 2, 2, 2)
        val res = intArrayOf(2, 2, 2, 1)
        Solution().swapIntegers(arr, 0, 3)
        assertContentEquals(res, arr)
    }
}
