import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(4, Solution().climbStairs2(3))
        assertEquals(7, Solution().climbStairs2(4))
    }
}
