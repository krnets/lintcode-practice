import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isUgly(6))
        assertTrue(Solution().isUgly(8))
        assertFalse(Solution().isUgly(14))
    }
}
