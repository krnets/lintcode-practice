import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().searchInsert(intArrayOf(1, 3, 5, 6), 5))
        assertEquals(1, Solution().searchInsert(intArrayOf(1, 3, 5, 6), 2))
        assertEquals(4, Solution().searchInsert(intArrayOf(1, 3, 5, 6), 7))
        assertEquals(0, Solution().searchInsert(intArrayOf(1, 3, 5, 6), 0))
        assertEquals(0, Solution().searchInsert(intArrayOf(), 9))
        assertEquals(3, Solution().searchInsert(intArrayOf(-1,0,1,2), 2))
    }
}
