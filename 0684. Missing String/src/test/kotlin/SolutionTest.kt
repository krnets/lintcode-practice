import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(listOf("This", "an"), Solution().missingString("This is an example", "is example"))
    }
}
