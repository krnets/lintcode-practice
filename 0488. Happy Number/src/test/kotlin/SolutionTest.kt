import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isHappy(19))
        assertFalse(Solution().isHappy(5))
    }
}
