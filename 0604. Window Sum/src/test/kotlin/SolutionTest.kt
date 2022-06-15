import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(intArrayOf(10, 17, 20), Solution().winSum(intArrayOf(1, 2, 7, 8, 5), 3))
        assertContentEquals(intArrayOf(), Solution().winSum(intArrayOf(), 0))
    }
}
