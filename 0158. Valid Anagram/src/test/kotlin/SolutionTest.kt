import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().anagram("ab", "ab"))
        assertTrue(Solution().anagram("abcd", "dcba"))
        assertFalse(Solution().anagram("ac", "ab"))
        assertFalse(Solution().anagram("ABAB", "tutu"))
        assertFalse(Solution().anagram("ahah", "nunu"))
    }
}
