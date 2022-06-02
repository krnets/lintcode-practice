import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(listOf(1, 2, 3, 4), Solution().generate(4))
    }
}
