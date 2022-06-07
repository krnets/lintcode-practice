import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val actual = Solution().permuteUnique(intArrayOf(1))
        val expected = listOf(intArrayOf(1))

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun BasicTest2() {
        val actual = Solution().permuteUnique(intArrayOf(1, 2, 2))
        val expected = listOf(
            intArrayOf(1, 2, 2),
            intArrayOf(2, 1, 2),
            intArrayOf(2, 2, 1),
        )

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }
}
