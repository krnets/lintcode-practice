import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("A", Solution().longestCommonPrefix(arrayOf("ABCD", "ABEF", "ACEF")))
        assertEquals("ABC", Solution().longestCommonPrefix(arrayOf("ABCDEFG", "ABCEFG", "ABCEFA")))
        assertEquals("", Solution().longestCommonPrefix(arrayOf()))
    }
}
