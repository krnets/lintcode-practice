import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().treePlanning(intArrayOf(1, 2, 3, 5, 6), 2))
        assertEquals(0, Solution().treePlanning(intArrayOf(1, 10), 8))
    }
}
