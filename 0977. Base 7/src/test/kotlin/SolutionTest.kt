import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("202", Solution().convertToBase7(100))
        assertEquals("-10", Solution().convertToBase7(-7))
    }
}
