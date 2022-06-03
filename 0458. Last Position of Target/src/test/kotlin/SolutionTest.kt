import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().lastPosition(intArrayOf(1, 2, 2, 4, 5), 2))
        assertEquals(5, Solution().lastPosition(intArrayOf(1, 2, 2, 4, 5, 5), 5))
        assertEquals(-1, Solution().lastPosition(intArrayOf(1, 2, 2, 4, 5), 6))
        assertEquals(-1, Solution().lastPosition(intArrayOf(), 10))
        assertEquals(10, Solution().lastPosition(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1), 1))
    }
}
