import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isPalindrome("A man, a plan, a canal: Panama"))
        assertTrue(Solution().isPalindrome("race car"))
        assertFalse(Solution().isPalindrome("race a car"))
        assertTrue(Solution().isPalindrome("1b , 1"))
        assertTrue(Solution().isPalindrome(".,"))
    }
}
