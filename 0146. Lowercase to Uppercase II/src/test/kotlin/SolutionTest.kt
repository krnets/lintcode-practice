import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("ABC", Solution().lowercaseToUppercase2("abc"))
        assertEquals("ABC", Solution().lowercaseToUppercase2("aBc"))
        assertEquals("ABC12", Solution().lowercaseToUppercase2("abC12"))
    }
}
