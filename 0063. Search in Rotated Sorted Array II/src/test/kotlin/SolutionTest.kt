import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertFalse(Solution().search(intArrayOf(), 1))
        assertTrue(Solution().search(intArrayOf(3, 4, 4, 5, 7, 0, 1, 2), 4))
        assertTrue(Solution().search(intArrayOf(9, 5, 6, 7, 8, 9, 9, 9, 9, 9, 9), 8))
        assertTrue(Solution().search(intArrayOf(2, 2, 2, 3, 1), 1))
    }
}
