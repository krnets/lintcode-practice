import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().canPartition(intArrayOf(1, 5, 11, 5)))
        assertFalse(Solution().canPartition(intArrayOf(1, 2, 3, 9)))
    }
}
