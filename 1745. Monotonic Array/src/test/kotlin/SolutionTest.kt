import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isMonotonic(intArrayOf(1, 2, 2, 3)))
        assertTrue(Solution().isMonotonic(intArrayOf(6, 5, 4, 4)))
        assertFalse(Solution().isMonotonic(intArrayOf(1, 3, 2)))
    }
}
