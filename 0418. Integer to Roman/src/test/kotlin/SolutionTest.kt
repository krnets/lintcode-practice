import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("I", Solution().intToRoman(1))
        assertEquals("XCIX", Solution().intToRoman(99))
        assertEquals("MCMXII", Solution().intToRoman(1912))
        assertEquals("MMXXII", Solution().intToRoman(2022))
    }
}
