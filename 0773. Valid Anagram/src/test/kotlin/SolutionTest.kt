import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isAnagram("anagram", "nagaram"))
        assertFalse(Solution().isAnagram("rat", "cat"))
    }
}
