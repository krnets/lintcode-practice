import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().romanToInt("I"))
        assertEquals(4, Solution().romanToInt("IV"))
        assertEquals(99, Solution().romanToInt("XCIX"))
        assertEquals(1912, Solution().romanToInt("MCMXII"))
        assertEquals(2022, Solution().romanToInt("MMXXII"))
    }
}
