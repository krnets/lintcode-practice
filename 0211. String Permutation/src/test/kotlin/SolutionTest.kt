import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().permutation("abcd", "bcad"))
        assertFalse(Solution().permutation("aac", "abc"))
    }
}
