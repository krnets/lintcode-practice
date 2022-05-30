import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().digitalPairing(intArrayOf(2, 3, 5, 1)))
    }
}
