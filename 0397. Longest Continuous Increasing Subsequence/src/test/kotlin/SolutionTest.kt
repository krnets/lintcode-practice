import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(4, Solution().longestIncreasingContinuousSubsequence(intArrayOf(5, 4, 2, 1, 3)))
        assertEquals(4, Solution().longestIncreasingContinuousSubsequence(intArrayOf(5, 1, 2, 3, 4)))
        assertEquals(1, Solution().longestIncreasingContinuousSubsequence(intArrayOf(10)))
        assertEquals(0, Solution().longestIncreasingContinuousSubsequence(intArrayOf()))
    }
}
