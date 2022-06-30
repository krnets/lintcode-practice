import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isUnique(intArrayOf(0, 2, 1)))
        assertFalse(Solution().isUnique(intArrayOf(2, 1, 1, 0)))
    }
}
