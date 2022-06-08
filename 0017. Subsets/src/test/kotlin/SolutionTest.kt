import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest0() {
        val actual = Solution().subsets(intArrayOf(0))
        val expected = listOf(intArrayOf(), intArrayOf(0))

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun BasicTest3() {
        val actual = Solution().subsets(intArrayOf(1, 2, 3))
        val expected = listOf(
            intArrayOf(),
            intArrayOf(1),
            intArrayOf(2),
            intArrayOf(1, 2),
            intArrayOf(3),
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(1, 2, 3),
        )
    }

    @Test
    fun BasicTest4() {
        val actual = Solution().subsets(intArrayOf(1, 2, 3, 4))
        val expected = listOf(
            intArrayOf(),
            intArrayOf(1),
            intArrayOf(2),
            intArrayOf(1, 2),
            intArrayOf(3),
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(1, 2, 3),
            intArrayOf(4),
            intArrayOf(1, 4),
            intArrayOf(2, 4),
            intArrayOf(1, 2, 4),
            intArrayOf(3, 4),
            intArrayOf(1, 3, 4),
            intArrayOf(2, 3, 4),
            intArrayOf(1, 2, 3, 4),
        )

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun BasicTest5() {
        val actual = Solution().subsets(intArrayOf(1, 2, 3, 4, 5))
        val expected = listOf(
            intArrayOf(),
            intArrayOf(1),
            intArrayOf(2),
            intArrayOf(1, 2),
            intArrayOf(3),
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(1, 2, 3),
            intArrayOf(4),
            intArrayOf(1, 4),
            intArrayOf(2, 4),
            intArrayOf(1, 2, 4),
            intArrayOf(3, 4),
            intArrayOf(1, 3, 4),
            intArrayOf(2, 3, 4),
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5),
            intArrayOf(1, 5),
            intArrayOf(2, 5),
            intArrayOf(1, 2, 5),
            intArrayOf(3, 5),
            intArrayOf(1, 3, 5),
            intArrayOf(2, 3, 5),
            intArrayOf(1, 2, 3, 5),
            intArrayOf(4, 5),
            intArrayOf(1, 4, 5),
            intArrayOf(2, 4, 5),
            intArrayOf(1, 2, 4, 5),
            intArrayOf(3, 4, 5),
            intArrayOf(1, 3, 4, 5),
            intArrayOf(2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5),
        )

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }
}
