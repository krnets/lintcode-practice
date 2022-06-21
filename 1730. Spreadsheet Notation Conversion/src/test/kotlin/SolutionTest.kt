import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("1A", Solution().convert(1))
        assertEquals("1B", Solution().convert(2))
        assertEquals("1C", Solution().convert(3))
        assertEquals("1Z", Solution().convert(26))
        assertEquals("1AA", Solution().convert(27))
        assertEquals("1AB", Solution().convert(28))
        assertEquals("1ZZ", Solution().convert(702))
        assertEquals("2C", Solution().convert(705))
        assertEquals("2ZZ", Solution().convert(1404))
    }
}
