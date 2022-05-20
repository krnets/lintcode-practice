import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(0, Solution().binarySearch(intArrayOf(1, 4, 4, 5, 7, 7, 8, 9, 9, 10), 1))
        assertEquals(2, Solution().binarySearch(intArrayOf(1, 2, 3, 3, 4, 5, 10), 3))
        assertEquals(-1, Solution().binarySearch(intArrayOf(1, 2, 3, 3, 4, 5, 10), 6))
    }
}
