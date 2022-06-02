import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().findMissing(intArrayOf(0, 1, 3)))
        assertEquals(0, Solution().findMissing(intArrayOf(1, 2, 3)))
        assertEquals(1, Solution().findMissing(intArrayOf(0)))
        assertEquals(3, Solution().findMissing(intArrayOf(9, 8, 7, 6, 2, 0, 1, 5, 4)))
    }
}
