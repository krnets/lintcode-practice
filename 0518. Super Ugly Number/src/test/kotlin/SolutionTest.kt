import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(1, Solution().nthSuperUglyNumber(1, intArrayOf(2, 7, 13, 19)))
        assertEquals(2, Solution().nthSuperUglyNumber(2, intArrayOf(2, 7, 13, 19)))
        assertEquals(4, Solution().nthSuperUglyNumber(3, intArrayOf(2, 7, 13, 19)))
        assertEquals(7, Solution().nthSuperUglyNumber(4, intArrayOf(2, 7, 13, 19)))
        assertEquals(8, Solution().nthSuperUglyNumber(5, intArrayOf(2, 7, 13, 19)))
        assertEquals(13, Solution().nthSuperUglyNumber(6, intArrayOf(2, 7, 13, 19)))
        assertEquals(14, Solution().nthSuperUglyNumber(7, intArrayOf(2, 7, 13, 19)))
        assertEquals(16, Solution().nthSuperUglyNumber(8, intArrayOf(2, 7, 13, 19)))
        assertEquals(19, Solution().nthSuperUglyNumber(9, intArrayOf(2, 7, 13, 19)))
        assertEquals(26, Solution().nthSuperUglyNumber(10, intArrayOf(2, 7, 13, 19)))
        assertEquals(28, Solution().nthSuperUglyNumber(11, intArrayOf(2, 7, 13, 19)))
        assertEquals(32, Solution().nthSuperUglyNumber(12, intArrayOf(2, 7, 13, 19)))
    }

    @Test
    fun BasicTest2() {
        assertEquals(1, Solution().nthSuperUglyNumber(1, intArrayOf(2, 3, 5)))
        assertEquals(6, Solution().nthSuperUglyNumber(6, intArrayOf(2, 3, 5)))
        assertEquals(10, Solution().nthSuperUglyNumber(9, intArrayOf(2, 3, 5)))
        assertEquals(12, Solution().nthSuperUglyNumber(10, intArrayOf(2, 3, 5)))
        assertEquals(15, Solution().nthSuperUglyNumber(11, intArrayOf(2, 3, 5)))
    }
}
