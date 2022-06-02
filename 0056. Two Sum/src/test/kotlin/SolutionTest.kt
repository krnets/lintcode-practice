import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(intArrayOf(0, 1), Solution().twoSum(intArrayOf(2, 7, 11, 15), 9))
        assertContentEquals(intArrayOf(1, 2), Solution().twoSum(intArrayOf(15, 2, 7, 11), 9))
    }
}
