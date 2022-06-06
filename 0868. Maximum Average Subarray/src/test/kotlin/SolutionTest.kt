import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(12.75, Solution().findMaxAverage(intArrayOf(1, 12, -5, -6, 50, 3), 4))
        assertEquals(3.00, Solution().findMaxAverage(intArrayOf(4, 2, 1, 3, 3), 2))
    }
}
