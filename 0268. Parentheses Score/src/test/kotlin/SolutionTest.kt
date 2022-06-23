import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
//        assertEquals(1, Solution().parenthesesScore("()"))
//        assertEquals(2, Solution().parenthesesScore("(())"))
//        assertEquals(2, Solution().parenthesesScore("()()"))
        assertEquals(6, Solution().parenthesesScore("(()(()))"))
    }
}
