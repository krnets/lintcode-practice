import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(0, Solution().firstUniqChar("lintcode"))
        assertEquals(-1, Solution().firstUniqChar(""))
        assertEquals(2, Solution().firstUniqChar("lovelintcode"))
    }
}
