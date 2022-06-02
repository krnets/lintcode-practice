import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().secondMax(intArrayOf(1, 3, 2, 4)))
        assertEquals(2, Solution().secondMax(intArrayOf(1, 1, 2, 2)))
        assertEquals(-1, Solution().secondMax(intArrayOf(1, -1, -2)))
    }
}
