import org.junit.Assert.*
import org.junit.Test

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