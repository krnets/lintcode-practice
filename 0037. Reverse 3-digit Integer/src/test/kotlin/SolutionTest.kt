import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(321, Solution().reverseInteger(123))
        assertEquals(9, Solution().reverseInteger(900))
    }
}
