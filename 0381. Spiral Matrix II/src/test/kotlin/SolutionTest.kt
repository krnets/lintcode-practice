import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest2() {
        val actual = Solution().generateMatrix(2)
        val expected = arrayOf(intArrayOf(1, 2), intArrayOf(4, 3))

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun BasicTest3() {
        val actual = Solution().generateMatrix(3)
        val expected = arrayOf(intArrayOf(1, 2, 3), intArrayOf(8, 9, 4), intArrayOf(7, 6, 5))

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }
}
