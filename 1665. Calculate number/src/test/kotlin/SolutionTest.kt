import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(intArrayOf(2, 1, 3), Solution().calculateNumber(10))
        assertContentEquals(intArrayOf(3, 1, 2, 3), Solution().calculateNumber(7))
    }
}
