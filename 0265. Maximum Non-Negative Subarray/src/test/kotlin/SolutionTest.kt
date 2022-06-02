import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(9, Solution().maxNonNegativeSubArray(intArrayOf(1, 2, -3, 4, 5, -6)))
    }
}
