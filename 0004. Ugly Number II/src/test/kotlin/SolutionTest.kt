import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().nthUglyNumber(1))
        assertEquals(6, Solution().nthUglyNumber(6))
        assertEquals(10, Solution().nthUglyNumber(9))
        assertEquals(12, Solution().nthUglyNumber(10))
        assertEquals(1898437500, Solution().nthUglyNumber(1665))
    }
}
