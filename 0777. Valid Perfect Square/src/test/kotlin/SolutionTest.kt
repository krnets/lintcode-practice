import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isPerfectSquare(16))
        assertTrue(Solution().isPerfectSquare(1000000))
        assertFalse(Solution().isPerfectSquare(15))
        assertFalse(Solution().isPerfectSquare(17))
        assertFalse(Solution().isPerfectSquare(2147483647))
    }
}
