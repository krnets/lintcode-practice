import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(4, Solution().kthLargestElement(1, intArrayOf(1, 3, 4, 2)))
    }
}
