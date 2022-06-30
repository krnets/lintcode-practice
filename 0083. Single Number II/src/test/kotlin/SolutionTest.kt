import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(4, Solution().singleNumberII(intArrayOf(1, 1, 2, 3, 3, 3, 2, 2, 4, 1)))
        assertEquals(1, Solution().singleNumberII(intArrayOf(2, 1, 2, 2)))
    }
}
