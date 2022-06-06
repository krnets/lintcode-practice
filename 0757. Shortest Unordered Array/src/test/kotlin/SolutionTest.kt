import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(0, Solution().shortestUnorderedArray(intArrayOf(1, 2, 3, 4, 5, 6)))
        assertEquals(3, Solution().shortestUnorderedArray(intArrayOf(1, 2, 1, 2)))
    }
}
