import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(intArrayOf(-1, -1), Solution().searchRange(intArrayOf(), 9))
        assertContentEquals(intArrayOf(0, 0), Solution().searchRange(intArrayOf(1), 1))
        assertContentEquals(intArrayOf(3, 4), Solution().searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8))
    }
}
