import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun `factorial 0`() {
        assertEquals("1", Solution().factorial(0))
    }

    @Test
    fun `factorial 20`() {
        assertEquals("2432902008176640000", Solution().factorial(20))
    }
}
