import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(123, Solution().stringToInteger("123"))
        assertEquals(2, Solution().stringToInteger("2"))
    }
}
