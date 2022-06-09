import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().findMin(intArrayOf(2, 1)))
        assertEquals(1, Solution().findMin(intArrayOf(1,2,2,2,2)))
        assertEquals(0, Solution().findMin(intArrayOf(4, 4, 5, 6, 7, 0, 1, 2)))
        assertEquals(-1, Solution().findMin(intArrayOf(1, 1, -1, 1)))
    }
}
