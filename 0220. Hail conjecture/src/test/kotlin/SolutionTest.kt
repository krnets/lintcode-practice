import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(2, Solution().getAnswer(4))
        assertEquals(6, Solution().getAnswer(10))
    }
}
