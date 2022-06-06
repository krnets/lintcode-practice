import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("ABCEW5", Solution().rearrange("AC2BEW3"))
        assertEquals("", Solution().rearrange(""))
    }
}
