import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().findNumber(intArrayOf(1, 1, 2, 3, 3, 3, 4, 5)))
        assertEquals(1, Solution().findNumber(intArrayOf(1)))
        assertEquals(2, Solution().findNumber(intArrayOf(1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 5)))
        assertEquals(3, Solution().findNumber(intArrayOf(5, 5, 5, 1, 1, 2, 3, 3, 3, 4)))
    }
}