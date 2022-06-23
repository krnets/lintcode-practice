import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().candy(intArrayOf(1, 2)))
        assertEquals(3, Solution().candy(intArrayOf(1, 1, 1)))
        assertEquals(4, Solution().candy(intArrayOf(1, 2, 2)))
    }
}
