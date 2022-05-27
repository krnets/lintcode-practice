import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(9, Solution().maxNonNegativeSubArray(intArrayOf(1, 2, -3, 4, 5, -6)))
    }
}
