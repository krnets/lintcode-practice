import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2.1f, Solution().maxOfArray(floatArrayOf(1.0f, 2.1f, -3.3f)))
        assertEquals(1.0f, Solution().maxOfArray(floatArrayOf(1.0f, 1.0f, -3.3f)))
    }
}
