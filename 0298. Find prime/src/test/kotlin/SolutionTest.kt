import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(listOf(2, 3, 5), Solution().prime(5))
    }
}
