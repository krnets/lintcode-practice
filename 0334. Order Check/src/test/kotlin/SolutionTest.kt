import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().orderCheck(listOf(1, 1, 3, 3, 4, 1)))
    }
}
