import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(intArrayOf(3, 4, 6), Solution().getUniqueArray(intArrayOf(3, 4, 3, 6)))
    }
}
