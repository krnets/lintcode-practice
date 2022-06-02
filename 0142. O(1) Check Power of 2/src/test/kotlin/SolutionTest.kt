import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().checkPowerOf2(4))
        assertFalse(Solution().checkPowerOf2(5))
        assertFalse(Solution().checkPowerOf2(-2147483648))
    }
}
