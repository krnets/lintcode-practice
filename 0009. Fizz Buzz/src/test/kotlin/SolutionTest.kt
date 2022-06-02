import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        val expected = listOf(
            "1", "2", "fizz", "4", "buzz", "fizz",
            "7", "8", "fizz", "buzz", "11", "fizz",
            "13", "14", "fizz buzz"
        )
        assertEquals(expected, Solution().fizzBuzz(15))
    }
}
