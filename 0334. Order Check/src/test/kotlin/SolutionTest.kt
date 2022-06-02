import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().orderCheck(listOf(1, 1, 3, 3, 4, 1)))
    }
}
