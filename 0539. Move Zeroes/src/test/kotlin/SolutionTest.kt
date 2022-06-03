import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        Solution().moveZeroes(nums)
        val expected = intArrayOf(1, 3, 12, 0, 0)
        assertContentEquals(expected, nums)
    }

    @Test
    fun BasicTest2() {
        val nums = intArrayOf(0, 0, 0, 3, 1)
        Solution().moveZeroes(nums)
        val expected = intArrayOf(3, 1, 0, 0, 0)
        assertContentEquals(expected, nums)
    }
}
