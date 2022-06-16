import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(30, Solution().calPoints(arrayOf("5", "2", "C", "D", "+")))
        assertEquals(27, Solution().calPoints(arrayOf("5", "-2", "4", "C", "D", "9", "+", "+")))
    }
}
