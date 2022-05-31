import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertFalse(Solution().matchParentheses(")("))
        assertFalse(Solution().matchParentheses("(]"))
        assertTrue(Solution().matchParentheses("()"))
    }
}
