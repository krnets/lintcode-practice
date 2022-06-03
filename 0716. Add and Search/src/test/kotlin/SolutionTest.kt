import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().addAndSearch(intArrayOf(-3, 5, 3), intArrayOf(-1, 0, 1, 2)))
        assertFalse(Solution().addAndSearch(intArrayOf(3, 4, 5), intArrayOf(1, 3, 6)))
    }
}
