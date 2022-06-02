import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(true, Solution().isAlphanumeric('1'))
        assertEquals(true, Solution().isAlphanumeric('u'))
        assertEquals(true, Solution().isAlphanumeric('A'))
        assertEquals(true, Solution().isAlphanumeric('z'))
        assertEquals(true, Solution().isAlphanumeric('7'))
        assertEquals(false, Solution().isAlphanumeric('^'))
        assertEquals(false, Solution().isAlphanumeric('!'))
    }
}
