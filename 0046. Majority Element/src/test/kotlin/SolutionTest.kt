import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().majorityNumber(listOf(1, 1, 1, 1, 2, 2, 2)))
        assertEquals(2, Solution().majorityNumber(listOf(1, 1, 1, 2, 2, 2, 2)))
    }
}
