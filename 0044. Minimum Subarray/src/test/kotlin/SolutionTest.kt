import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(-3, Solution().minSubArray(listOf(1,-1,-2,1)))
        assertEquals(-6, Solution().minSubArray(listOf(1,-1,-2,1,-4)))
    }
}
