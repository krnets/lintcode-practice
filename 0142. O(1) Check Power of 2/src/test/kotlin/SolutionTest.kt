import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().checkPowerOf2(4))
        assertFalse(Solution().checkPowerOf2(5))
        assertFalse(Solution().checkPowerOf2(-2147483648))
    }
}
