import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().addDigits(38))
        assertEquals(9, Solution().addDigits(9))
    }
}
