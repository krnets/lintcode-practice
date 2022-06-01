import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isHappy(19))
        assertFalse(Solution().isHappy(5))
    }
}
