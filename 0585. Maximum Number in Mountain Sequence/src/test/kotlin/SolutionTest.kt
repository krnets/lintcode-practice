import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(8, Solution().mountainSequence(intArrayOf(1, 2, 4, 8, 6, 3)))
        assertEquals(10, Solution().mountainSequence(intArrayOf(10, 9, 8, 7)))
    }
}
