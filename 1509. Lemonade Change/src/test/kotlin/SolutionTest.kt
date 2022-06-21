import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val bills = listOf(5, 5, 5, 10, 20)
        assertTrue(Solution().lemonadeChange(bills))
    }

    @Test
    fun BasicTest2() {
        val bills = listOf(5, 5, 10, 10, 20)
        assertFalse(Solution().lemonadeChange(bills))
    }

    @Test
    fun BasicTest3() {
        val bills = listOf(
            5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5, 5, 5,
            10, 5, 20, 5, 5, 5, 5, 5, 20, 5, 10, 5, 5, 5, 5, 20, 20, 5
        )
        assertTrue(Solution().lemonadeChange(bills))
    }
}
