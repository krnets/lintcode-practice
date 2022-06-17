import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        val cost = listOf(intArrayOf(5, 4), intArrayOf(3, 6), intArrayOf(1, 8), intArrayOf(3, 9))
        assertEquals(14, Solution().totalCost(cost))
    }
}
