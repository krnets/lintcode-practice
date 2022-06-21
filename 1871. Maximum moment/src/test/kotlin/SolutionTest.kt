import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("23:00", Solution().maximumMoment("2?:00"))
        assertEquals("23:59", Solution().maximumMoment("??:??"))
        assertEquals("18:59", Solution().maximumMoment("?8:59"))
        assertEquals("19:54", Solution().maximumMoment("1?:54"))
    }
}
