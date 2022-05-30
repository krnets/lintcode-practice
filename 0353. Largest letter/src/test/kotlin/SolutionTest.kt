import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("D", Solution().largestLetter("admeDCAB"))
        assertEquals("NO", Solution().largestLetter("adme"))
    }
}
