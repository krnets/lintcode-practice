import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().findElements(arrayOf(intArrayOf(2, 5, 3), intArrayOf(3, 2, 1), intArrayOf(1, 3, 5))))
        assertEquals(1, Solution().findElements(arrayOf(intArrayOf(1), intArrayOf(1), intArrayOf(1))))
    }
}
