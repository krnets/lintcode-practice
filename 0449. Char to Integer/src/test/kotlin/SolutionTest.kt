import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(97, Solution().charToInteger('a'))
        assertEquals(37, Solution().charToInteger('%'))
    }
}
