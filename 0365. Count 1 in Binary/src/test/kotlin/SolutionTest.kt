import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().countOnes(32))
        assertEquals(2, Solution().countOnes(5))
        assertEquals(32, Solution().countOnes(-1))
    }
}
