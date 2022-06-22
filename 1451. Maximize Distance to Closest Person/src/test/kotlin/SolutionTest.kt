import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().maxDistToClosest(intArrayOf(1, 0, 0, 0, 1, 0, 1)))
        assertEquals(3, Solution().maxDistToClosest(intArrayOf(1, 0, 0, 0)))
        assertEquals(4, Solution().maxDistToClosest(intArrayOf(0, 0, 0, 0)))
        assertEquals(3, Solution().maxDistToClosest(intArrayOf(0, 0, 0, 1)))
        assertEquals(1, Solution().maxDistToClosest(intArrayOf(1, 0, 0, 1)))
        assertEquals(1, Solution().maxDistToClosest(intArrayOf(1, 1, 0, 1)))
        assertEquals(1, Solution().maxDistToClosest(intArrayOf(1, 0, 1, 1)))
    }
}
