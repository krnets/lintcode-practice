import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("23:00", Solution().maximumMoment("2?:00"))
        assertEquals("23:59", Solution().maximumMoment("??:??"))
    }
}
