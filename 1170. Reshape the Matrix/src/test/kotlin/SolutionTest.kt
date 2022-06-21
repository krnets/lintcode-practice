import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val nums = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val actual = Solution().matrixReshape(nums, 1, 4)
        val expected = arrayOf(intArrayOf(1, 2, 3, 4))

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun BasicTest2() {
        val nums = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val actual = Solution().matrixReshape(nums, 2, 4)
        val expected = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }
}
