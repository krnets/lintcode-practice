import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertFalse(Solution().find132pattern(intArrayOf(1, 2, 3, 4)))
        assertTrue(Solution().find132pattern(intArrayOf(3, 1, 4, 2)))
        assertTrue(Solution().find132pattern(intArrayOf(1, 3, 2)))
    }
}
