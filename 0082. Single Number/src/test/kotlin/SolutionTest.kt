import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().singleNumber(intArrayOf(1,1,2,2,3,4,4)))
        assertEquals(1, Solution().singleNumber(intArrayOf(0,0,1)))
    }
}
