import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val points = arrayOf(intArrayOf(0, 0), intArrayOf(0, 1), intArrayOf(1, 0), intArrayOf(0, 2), intArrayOf(2, 0))
        assertEquals(2.0, Solution().largestTriangleArea(points))
    }

    @Test
    fun BasicTest2() {
        val points = arrayOf(intArrayOf(4, 6), intArrayOf(6, 5), intArrayOf(3, 1))
        assertEquals(5.5, Solution().largestTriangleArea(points))
    }
}
