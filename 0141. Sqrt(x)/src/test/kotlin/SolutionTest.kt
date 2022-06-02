import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(0, Solution().sqrt(0))
        assertEquals(1, Solution().sqrt(3))
        assertEquals(2, Solution().sqrt(4))
        assertEquals(46340, Solution().sqrt(2147483647))
    }
}
