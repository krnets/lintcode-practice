import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val imagePixels = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 1),
            intArrayOf(1, 1, 1),
        )
        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
            intArrayOf(0, 0, 0),
        )
        val actual = Solution().imageSmoother(imagePixels)

        assertEquals(expected.size, actual.size)

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun BasicTest2() {
        val imagePixels = arrayOf(
            intArrayOf(100, 200, 100),
            intArrayOf(200, 50, 200),
            intArrayOf(100, 200, 100),
        )
        val expected = arrayOf(
            intArrayOf(137, 141, 137),
            intArrayOf(141, 138, 141),
            intArrayOf(137, 141, 137),
        )
        val actual = Solution().imageSmoother(imagePixels)

        assertEquals(expected.size, actual.size)

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }
}
