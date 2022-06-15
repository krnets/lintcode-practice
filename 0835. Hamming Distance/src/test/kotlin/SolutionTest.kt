import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().hammingDistance(1, 4))
        assertEquals(3, Solution().hammingDistance(5, 2))
    }
}
