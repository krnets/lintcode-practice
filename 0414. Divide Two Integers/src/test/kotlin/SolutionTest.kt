import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(0, Solution().divide(0, 1))
        assertEquals(11, Solution().divide(100, 9))
        assertEquals(-1073741824, Solution().divide(-2147483648, 2))
        assertEquals(2147483647, Solution().divide(-2147483648, -1))
    }
}
