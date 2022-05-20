import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(321, Solution().reverseInteger(123))
        assertEquals(9, Solution().reverseInteger(900))
    }
}
