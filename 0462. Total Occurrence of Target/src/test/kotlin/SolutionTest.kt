import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().totalOccurrence(intArrayOf(1, 3, 3, 4, 5), 3))
        assertEquals(1, Solution().totalOccurrence(intArrayOf(2, 2, 3, 4, 6), 4))
        assertEquals(0, Solution().totalOccurrence(intArrayOf(1, 2, 3, 4, 5), 6))
    }
}
