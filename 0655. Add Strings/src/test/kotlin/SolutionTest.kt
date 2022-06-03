import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("168", Solution().addStrings("123", "45"))
        assertEquals("10000000000000", Solution().addStrings("9999999999981", "19"))
    }
}
