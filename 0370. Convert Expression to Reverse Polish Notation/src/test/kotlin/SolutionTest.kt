import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertContentEquals(
            listOf("3", "4", "-", "5", "+"),
            Solution().convertToRPN(arrayOf("3", "-", "4", "+", "5"))
        )
    }

    @Test
    fun BasicTest2() {
        assertContentEquals(
            listOf("5", "6", "-", "7", "*"),
            Solution().convertToRPN(arrayOf("(", "5", "-", "6", ")", "*", "7"))
        )
    }
}
