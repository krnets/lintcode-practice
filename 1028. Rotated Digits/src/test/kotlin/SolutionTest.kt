import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(4, Solution().rotatedDigits(10))
        assertEquals(2, Solution().rotatedDigits(5))
        assertEquals(1522, Solution().rotatedDigits(6610))
    }
}
