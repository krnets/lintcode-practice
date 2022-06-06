import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("101", Solution().hexConversion(5, 2))
        assertEquals("1111", Solution().hexConversion(15, 2))
        assertEquals("17", Solution().hexConversion(15, 8))
        assertEquals("1E", Solution().hexConversion(30, 16))
        assertEquals("107FE6E", Solution().hexConversion(17301102, 16))
        assertEquals("0", Solution().hexConversion(0, 16))
    }
}
