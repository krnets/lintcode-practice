import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        val nums = intArrayOf(1, 2, 5)
        Solution().reverseArray(nums)
        assertContentEquals(intArrayOf(5, 2, 1), nums)
    }
}
