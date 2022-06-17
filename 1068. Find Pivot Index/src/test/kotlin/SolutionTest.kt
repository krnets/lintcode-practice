import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6)))
        assertEquals(-1, Solution().pivotIndex(intArrayOf(1, 2, 3)))
        assertEquals(-1, Solution().pivotIndex(intArrayOf()))
        assertEquals(4, Solution().pivotIndex(intArrayOf(-1, -1, 0, 1, 0, -1)))
    }
}
