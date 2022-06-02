import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("D", Solution().largestLetter("admeDCAB"))
        assertEquals("NO", Solution().largestLetter("adme"))
    }
}
