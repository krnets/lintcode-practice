import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(15, Solution().doubleFactorial(5))
        assertEquals(48, Solution().doubleFactorial(6))
    }
}
