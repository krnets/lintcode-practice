import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(4, Solution().arrayPairSum(intArrayOf(1, 4, 3, 2)))
        assertEquals(5, Solution().arrayPairSum(intArrayOf(5, 6)))
        assertEquals(9, Solution().arrayPairSum(intArrayOf(6, 2, 6, 5, 1, 2)))
    }
}
