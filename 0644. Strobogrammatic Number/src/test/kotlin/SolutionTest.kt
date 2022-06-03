import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isStrobogrammatic("69"))
        assertTrue(Solution().isStrobogrammatic("10698186901"))
        assertFalse(Solution().isStrobogrammatic("96801866799810896"))
        assertFalse(Solution().isStrobogrammatic("7"))
        assertFalse(Solution().isStrobogrammatic("68"))
    }
}
