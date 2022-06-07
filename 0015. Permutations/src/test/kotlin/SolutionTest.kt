import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val actual = Solution().permute(intArrayOf(1))
        val expected = listOf(intArrayOf(1))

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun BasicTest2() {
        val actual = Solution().permute(intArrayOf(1, 2, 3))
        val expected = listOf(
            intArrayOf(1, 2, 3),
            intArrayOf(1, 3, 2),
            intArrayOf(2, 1, 3),
            intArrayOf(2, 3, 1),
            intArrayOf(3, 1, 2),
            intArrayOf(3, 2, 1)
        )

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }
}
