import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(0, Solution().climbStairs(0))
        assertEquals(1, Solution().climbStairs(1))
        assertEquals(3, Solution().climbStairs(3))
    }
}
