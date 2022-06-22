import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().luckyNumber(20))
        assertEquals(19, Solution().luckyNumber(100))
    }
}
