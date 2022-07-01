import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().change(10, intArrayOf(10)))
        assertEquals(3, Solution().change(8, intArrayOf(2, 3, 8)))
    }
}
