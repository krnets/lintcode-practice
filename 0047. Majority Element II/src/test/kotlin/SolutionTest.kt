import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(99, Solution().majorityNumber(listOf(99, 2, 99, 2, 99, 3, 3)))
        assertEquals(1, Solution().majorityNumber(listOf(1, 2, 1, 2, 1, 3, 3)))
        assertEquals(1, Solution().majorityNumber(listOf(1,1,2)))
    }
}
