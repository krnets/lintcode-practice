import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("ab", Solution().deleteChar("fskacsbi", 2))
        assertEquals("aac", Solution().deleteChar("fsakbacsi", 3))
    }
}
