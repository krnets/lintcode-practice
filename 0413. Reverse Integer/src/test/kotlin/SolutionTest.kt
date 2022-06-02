import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(321, Solution().reverseInteger(123))
        assertEquals(0, Solution().reverseInteger(1534236469))
        assertEquals(-321, Solution().reverseInteger(-123))
        assertEquals(-1, Solution().reverseInteger(-10))
    }
}
