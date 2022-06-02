import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("ABC", Solution().lowercaseToUppercase2("abc"))
        assertEquals("ABC", Solution().lowercaseToUppercase2("aBc"))
        assertEquals("ABC12", Solution().lowercaseToUppercase2("abC12"))
    }
}
