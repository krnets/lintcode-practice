import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertFalse(Solution().canPermutePalindrome("code"))
        assertTrue(Solution().canPermutePalindrome("aab"))
        assertTrue(Solution().canPermutePalindrome("racecar"))
    }
}
