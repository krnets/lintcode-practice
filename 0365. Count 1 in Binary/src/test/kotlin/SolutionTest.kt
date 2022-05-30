import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().countOnes(32))
        assertEquals(2, Solution().countOnes(5))
        assertEquals(32, Solution().countOnes(-1))
    }
}
