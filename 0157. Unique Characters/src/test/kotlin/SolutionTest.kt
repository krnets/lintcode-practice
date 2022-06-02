import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertFalse(Solution().isUnique("abc_____"))
        assertTrue(Solution().isUnique("abc"))
    }
}
