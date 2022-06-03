import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isPalindrome(11))
        assertFalse(Solution().isPalindrome(10))
        assertFalse(Solution().isPalindrome(1232))
    }
}
