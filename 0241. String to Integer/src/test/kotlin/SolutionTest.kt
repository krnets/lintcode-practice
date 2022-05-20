import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(123, Solution().stringToInteger("123"))
        assertEquals(2, Solution().stringToInteger("2"))
    }
}
