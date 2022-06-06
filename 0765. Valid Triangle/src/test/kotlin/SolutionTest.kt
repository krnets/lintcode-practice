import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isValidTriangle(2, 3, 4))
        assertFalse(Solution().isValidTriangle(1, 2, 3))
    }
}
