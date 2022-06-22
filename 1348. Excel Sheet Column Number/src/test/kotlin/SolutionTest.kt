import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().titleToNumber("A"))
        assertEquals(2, Solution().titleToNumber("B"))
        assertEquals(3, Solution().titleToNumber("C"))
        assertEquals(25, Solution().titleToNumber("Y"))
        assertEquals(26, Solution().titleToNumber("Z"))
        assertEquals(27, Solution().titleToNumber("AA"))
        assertEquals(28, Solution().titleToNumber("AB"))
        assertEquals(29, Solution().titleToNumber("AC"))
    }
}
