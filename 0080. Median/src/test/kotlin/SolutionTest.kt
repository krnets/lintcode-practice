import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().median(intArrayOf(4, 5, 1, 2, 3)))
        assertEquals(5, Solution().median(intArrayOf(7, 9, 4, 5)))
    }
}
