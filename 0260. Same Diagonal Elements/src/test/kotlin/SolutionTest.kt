import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        var matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(5, 1, 2), intArrayOf(6, 5, 1))
        assertTrue(Solution().judgeSame(matrix))
        matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(2, 1, 5), intArrayOf(6, 5, 1))
        assertFalse(Solution().judgeSame(matrix))
    }
}
