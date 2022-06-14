import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(6, Solution().maxDiffSubArrays(intArrayOf(1, 2, -3, 1)))
        assertEquals(1, Solution().maxDiffSubArrays(intArrayOf(0, 1)))
    }

    @Test
    fun BasicTest2() {
        assertEquals(29, Solution().maxDiffSubArrays(intArrayOf(-5, 3, -4, 0, 0, 0, -1, 20, 1, 1, -1, -1, -1, -1, -1)))
    }
}
