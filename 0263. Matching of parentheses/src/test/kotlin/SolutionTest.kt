import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertFalse(Solution().matchParentheses(")("))
        assertFalse(Solution().matchParentheses("(]"))
        assertTrue(Solution().matchParentheses("()"))
    }
}
