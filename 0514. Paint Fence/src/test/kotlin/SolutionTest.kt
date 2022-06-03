import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(6, Solution().numWays(3, 2))
        assertEquals(4, Solution().numWays(2, 2))
    }
}
