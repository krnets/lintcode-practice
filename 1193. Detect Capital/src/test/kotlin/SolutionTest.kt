import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().detectCapitalUse("USA"))
        assertTrue(Solution().detectCapitalUse("awefawfawfawefweafawfaefawf"))
        assertFalse(Solution().detectCapitalUse("FlaG"))
    }
}
