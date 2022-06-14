import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val actual = Solution().threeSum(intArrayOf(2, 7, 11, 15))
        assertEquals(0, actual.size)
    }

    @Test
    fun BasicTest2() {
        val actual = Solution().threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        val expected = listOf(
            intArrayOf(-1, -1, 2),
            intArrayOf(-1, 0, 1)
        )
        assertEquals(expected.size, actual.size)

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }
}
