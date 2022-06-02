import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(9, Solution().maxOfThreeNumbers(1, 9, 0))
        assertEquals(9, Solution().maxOfThreeNumbers(1, 0, 9))
        assertEquals(3, Solution().maxOfThreeNumbers(1, 2, 3))
    }
}
