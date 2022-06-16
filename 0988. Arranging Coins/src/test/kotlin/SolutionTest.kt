import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().arrangeCoins(5))
        assertEquals(3, Solution().arrangeCoins(8))
        assertEquals(1, Solution().arrangeCoins(1))
        assertEquals(0, Solution().arrangeCoins(0))
        assertEquals(60070, Solution().arrangeCoins(1804289383))
    }
}
