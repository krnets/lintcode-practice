import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("21", Solution().formMinimumNumber("D"))
        assertEquals("123", Solution().formMinimumNumber("II"))
        assertEquals("21435", Solution().formMinimumNumber("DIDI"))
        assertEquals("321654798", Solution().formMinimumNumber("DDIDDIID"))
    }
}
