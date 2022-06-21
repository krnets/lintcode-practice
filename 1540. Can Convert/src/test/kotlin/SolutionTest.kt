import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().canConvert("lintcode", "lint"))
        assertTrue(Solution().canConvert("lintcode", "code"))
        assertTrue(Solution().canConvert("lintcode", "ide"))
        assertFalse(Solution().canConvert("adda", "aad"))
        assertFalse(Solution().canConvert("a", "aa"))
        assertFalse(Solution().canConvert(null, "null"))
    }
}
