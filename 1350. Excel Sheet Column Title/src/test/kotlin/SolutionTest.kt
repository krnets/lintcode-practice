import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("A", Solution().convertToTitle(1))
        assertEquals("B", Solution().convertToTitle(2))
        assertEquals("C", Solution().convertToTitle(3))
        assertEquals("Z", Solution().convertToTitle(26))
        assertEquals("AA", Solution().convertToTitle(27))
        assertEquals("AB", Solution().convertToTitle(28))
        assertEquals("YZ", Solution().convertToTitle(676))
    }
}
