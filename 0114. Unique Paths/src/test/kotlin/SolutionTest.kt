import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().uniquePaths(3, 1))
        assertEquals(6, Solution().uniquePaths(3, 3))
    }
}
