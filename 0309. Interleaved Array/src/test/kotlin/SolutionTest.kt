import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(intArrayOf(1, 3, 2, 4), Solution().interleavedArray(intArrayOf(1, 2), intArrayOf(3, 4)))
    }
}
