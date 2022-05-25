import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(0, Solution().climbStairs(0))
        assertEquals(1, Solution().climbStairs(1))
        assertEquals(3, Solution().climbStairs(3))
    }
}
