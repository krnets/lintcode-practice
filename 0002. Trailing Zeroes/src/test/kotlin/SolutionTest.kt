import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().trailingZeros(5))
        assertEquals(2, Solution().trailingZeros(11))
        assertEquals(25, Solution().trailingZeros(105))
        assertEquals(250292920, Solution().trailingZeros(1001171717))
    }
}
