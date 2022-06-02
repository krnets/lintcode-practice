import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(-1, Solution().strStr("source", "target"))
        assertEquals(1, Solution().strStr("abcdabcdefg", "bcd"))
    }
}
