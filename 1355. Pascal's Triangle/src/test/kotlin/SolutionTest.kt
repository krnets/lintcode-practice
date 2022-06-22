import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun `first 5 rows of Pascal's triangle`() {
        val actual = Solution().generate(5)
        val expected = listOf(
            intArrayOf(1),
            intArrayOf(1, 1),
            intArrayOf(1, 2, 1),
            intArrayOf(1, 3, 3, 1),
            intArrayOf(1, 4, 6, 4, 1)
        )
        assertEquals(expected.size, actual.size)

        for (i in expected.indices) assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun `first 15 rows of Pascal's triangle`() {
        val actual = Solution().generate(15)
        val expected = listOf(
            intArrayOf(1),
            intArrayOf(1, 1),
            intArrayOf(1, 2, 1),
            intArrayOf(1, 3, 3, 1),
            intArrayOf(1, 4, 6, 4, 1),
            intArrayOf(1, 5, 10, 10, 5, 1),
            intArrayOf(1, 6, 15, 20, 15, 6, 1),
            intArrayOf(1, 7, 21, 35, 35, 21, 7, 1),
            intArrayOf(1, 8, 28, 56, 70, 56, 28, 8, 1),
            intArrayOf(1, 9, 36, 84, 126, 126, 84, 36, 9, 1),
            intArrayOf(1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1),
            intArrayOf(1, 11, 55, 165, 330, 462, 462, 330, 165, 55, 11, 1),
            intArrayOf(1, 12, 66, 220, 495, 792, 924, 792, 495, 220, 66, 12, 1),
            intArrayOf(1, 13, 78, 286, 715, 1287, 1716, 1716, 1287, 715, 286, 78, 13, 1),
            intArrayOf(1, 14, 91, 364, 1001, 2002, 3003, 3432, 3003, 2002, 1001, 364, 91, 14, 1)
        )
        assertEquals(expected.size, actual.size)

        for (i in expected.indices) assertContentEquals(expected[i], actual[i])
    }
}
