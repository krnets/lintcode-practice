import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().bitSwapRequired(31, 14))
        assertEquals(2, Solution().bitSwapRequired(1, 7))
        assertEquals(31, Solution().bitSwapRequired(1, -1))
        assertEquals(6, Solution().bitSwapRequired(-11, -789))
        assertEquals(4, Solution().bitSwapRequired(-2147483648, 11))
    }
}
