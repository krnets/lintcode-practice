import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val nums = intArrayOf(5, 1, 6, 1)
        Solution().moveTarget(nums, 1)
        val expected = intArrayOf(1, 1, 5, 6)
        assertContentEquals(expected, nums)
    }

    @Test
    fun BasicTest2() {
        val nums = intArrayOf(-1, 2, 3, 5, 2, 2)
        Solution().moveTarget(nums, 2)
        val expected = intArrayOf(2, 2, 2, -1, 3, 5)
        assertContentEquals(expected, nums)
    }

    @Test
    fun BasicTest3() {
        val nums = intArrayOf(2, 3, 4, 6)
        Solution().moveTarget(nums, 1)
        val expected = intArrayOf(2, 3, 4, 6)
        assertContentEquals(expected, nums)
    }
}
