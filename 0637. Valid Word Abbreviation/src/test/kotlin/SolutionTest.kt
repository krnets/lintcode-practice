import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().validWordAbbreviation("internationalization", "i12iz4n"))
        assertFalse(Solution().validWordAbbreviation("apple", "a2e"))
        assertFalse(Solution().validWordAbbreviation("a", "01"))
    }
}
