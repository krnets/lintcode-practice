import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(9, Solution().evalRPN(arrayOf("2", "1", "+", "3", "*")))
        assertEquals(6, Solution().evalRPN(arrayOf("4", "13", "5", "/", "+")))
        assertEquals(1, Solution().evalRPN(arrayOf("4","3","-")))
    }
}
