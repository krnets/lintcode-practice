import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(-1, Solution().strStr("source", "target"))
        assertEquals(1, Solution().strStr("abcdabcdefg", "bcd"))
    }
}