import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("cbgf", Solution().concatenetedString("aacdb", "gafd"))
        assertEquals("bsxz", Solution().concatenetedString("abcs", "cxzca"))
    }
}
