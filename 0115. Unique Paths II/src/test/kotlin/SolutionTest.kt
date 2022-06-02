import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val arr = arrayOf(intArrayOf(0))
        assertEquals(1, Solution().uniquePathsWithObstacles(arr))
    }

    @Test
    fun BasicTest2() {
        val arr = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))
        assertEquals(2, Solution().uniquePathsWithObstacles(arr))
    }

    @Test
    fun BasicTest3() {
        val arr = arrayOf(intArrayOf(0, 0), intArrayOf(0, 0), intArrayOf(0, 0), intArrayOf(1, 0), intArrayOf(0, 0))
        assertEquals(3, Solution().uniquePathsWithObstacles(arr))
    }

    @Test
    fun BasicTest4() {
        val arr = arrayOf(intArrayOf(1, 0), intArrayOf(0, 0), intArrayOf(0, 0), intArrayOf(0, 0), intArrayOf(0, 0))
        assertEquals(0, Solution().uniquePathsWithObstacles(arr))
    }
}
