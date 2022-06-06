import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().isLeapYear(2008))
        assertFalse(Solution().isLeapYear(2018))
    }
}
