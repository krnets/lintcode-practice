import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(0, Solution().fibonacci(1))
        assertEquals(1, Solution().fibonacci(2))
        assertEquals(1, Solution().fibonacci(3))
        assertEquals(2, Solution().fibonacci(4))
        assertEquals(3, Solution().fibonacci(5))
        assertEquals(5, Solution().fibonacci(6))
        assertEquals(8, Solution().fibonacci(7))
        assertEquals(13, Solution().fibonacci(8))
        assertEquals(21, Solution().fibonacci(9))
        assertEquals(34, Solution().fibonacci(10))
        assertEquals(55, Solution().fibonacci(11))
        assertEquals(89, Solution().fibonacci(12))
    }
}
