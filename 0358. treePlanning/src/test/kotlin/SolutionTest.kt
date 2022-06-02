import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().treePlanning(intArrayOf(1, 2, 3, 5, 6), 2))
        assertEquals(0, Solution().treePlanning(intArrayOf(1, 10), 8))
    }
}
