import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("YES", Solution().isBuild(10))
        assertEquals("YES", Solution().isBuild(13))
        assertEquals("NO", Solution().isBuild(5))
        assertEquals("NO", Solution().isBuild(11))
        assertEquals("NO", Solution().isBuild(4))
        assertEquals("NO", Solution().isBuild(8))
    }
}
