import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals('b', Solution().firstUniqChar("abaccdeff"))
        assertEquals('b', Solution().firstUniqChar("aabccd"))
    }
}
