import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(6, Solution().maxSubArray(intArrayOf(-2, 2, -3, 4, -1, 2, 1, -4, 3)))
        assertEquals(10, Solution().maxSubArray(intArrayOf(1, 2, 3, 4)))
    }
}
