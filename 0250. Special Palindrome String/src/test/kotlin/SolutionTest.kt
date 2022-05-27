import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().ispalindrome(listOf("at", "by", "yh", "hn", "mw", "ww"), word = "swims"))
        assertTrue(Solution().ispalindrome(listOf("at", "by", "yh", "hn", "mw", "ww"), word = "hob"))
        assertFalse(Solution().ispalindrome(listOf("at", "by", "yh", "hn", "mw", "ww"), word = "ban"))
    }
}
