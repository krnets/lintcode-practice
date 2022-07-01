import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().coinChange(intArrayOf(1, 2, 5), 11))
        assertEquals(-1, Solution().coinChange(intArrayOf(2), 3))
        assertEquals(0, Solution().coinChange(intArrayOf(0, 1), 0))
        assertEquals(2, Solution().coinChange(intArrayOf(0, 1, 1, 1, 8), 9))
        assertEquals(20, Solution().coinChange(intArrayOf(186, 419, 83, 408), 6249))
    }
}
