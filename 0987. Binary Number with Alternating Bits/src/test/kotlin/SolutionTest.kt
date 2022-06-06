import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun TestsTrue() {
        assertTrue(Solution().hasAlternatingBits(5))
        assertTrue(Solution().hasAlternatingBits(10))
    }

    @Test
    fun TestsFalse() {
        assertFalse(Solution().hasAlternatingBits(7))
        assertFalse(Solution().hasAlternatingBits(11))
        assertFalse(Solution().hasAlternatingBits(12))
    }
}
