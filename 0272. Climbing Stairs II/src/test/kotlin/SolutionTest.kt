import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(4, Solution().climbStairs2(3))
        assertEquals(7, Solution().climbStairs2(4))
    }
}
