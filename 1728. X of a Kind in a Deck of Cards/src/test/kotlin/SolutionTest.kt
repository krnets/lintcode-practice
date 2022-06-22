import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().hasGroupsSizeX(listOf(1, 2, 3, 4, 4, 3, 2, 1)))
        assertFalse(Solution().hasGroupsSizeX(listOf(1, 1, 1, 2, 2, 2, 3, 3)))
        assertFalse(Solution().hasGroupsSizeX(listOf(1)))

    }
}
