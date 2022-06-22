import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val expected = listOf(intArrayOf(3, 6))
        val actual = Solution().largeGroupPositions("abbxxxxzzy")

        assertEquals(expected.size, actual.size)

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun BasicTest2() {
        val expected = listOf<IntArray>()
        val actual = Solution().largeGroupPositions("abc")

        assertEquals(expected.size, actual.size)

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }
}
