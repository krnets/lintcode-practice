import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(true, Solution().compareStrings("ABCD", "ACD"))
        assertEquals(false, Solution().compareStrings("ABCD", "AABC"))
    }
}
