import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().checkSumOfSquareNumbers(5))
        assertTrue(Solution().checkSumOfSquareNumbers(1))
        assertTrue(Solution().checkSumOfSquareNumbers(0))
        assertFalse(Solution().checkSumOfSquareNumbers(-5))
    }
}
