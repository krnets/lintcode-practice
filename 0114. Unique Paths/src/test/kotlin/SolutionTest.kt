import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().uniquePaths(3, 1))
        assertEquals(6, Solution().uniquePaths(3, 3))
    }
}
