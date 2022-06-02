import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertFalse(Solution().isValidParentheses("([)]"))
        assertTrue(Solution().isValidParentheses("()[]{}"))
    }
}
