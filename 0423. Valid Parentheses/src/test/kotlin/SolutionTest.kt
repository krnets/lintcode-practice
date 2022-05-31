import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertFalse(Solution().isValidParentheses("([)]"))
        assertTrue(Solution().isValidParentheses("()[]{}"))
    }
}
