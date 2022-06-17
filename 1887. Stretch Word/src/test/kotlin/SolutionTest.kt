import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(4, Solution().stretchWord("helllllooo"))
        assertEquals(4, Solution().stretchWord("bbaa"))
    }
}
