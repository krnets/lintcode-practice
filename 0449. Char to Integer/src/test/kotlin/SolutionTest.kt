import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(97, Solution().charToInteger('a'))
        assertEquals(37, Solution().charToInteger('%'))
    }
}
