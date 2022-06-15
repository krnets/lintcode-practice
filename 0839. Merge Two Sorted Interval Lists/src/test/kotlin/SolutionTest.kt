import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val list1 = listOf(Interval(1, 2), Interval(3, 4))
        val list2 = listOf(Interval(2, 3), Interval(5, 6))
        val expected = listOf(Interval(1, 4), Interval(5, 6))
        val actual = Solution().mergeTwoInterval(list1, list2)
        assertEquals(expected.size, actual.size)

        for (i in expected.indices) {
            assertEquals(expected[i].start, actual[i]!!.start)
            assertEquals(expected[i].end, actual[i]!!.end)
        }
    }

    @Test
    fun BasicTest2() {
        val list1 = listOf(Interval(1, 2), Interval(3, 4))
        val list2 = listOf(Interval(4, 5), Interval(6, 7))
        val expected = listOf(Interval(1, 2), Interval(3, 5), Interval(6, 7))
        val actual = Solution().mergeTwoInterval(list1, list2)
        assertEquals(expected.size, actual.size)

        for (i in expected.indices) {
            assertEquals(expected[i].start, actual[i]!!.start)
            assertEquals(expected[i].end, actual[i]!!.end)
        }
    }
}
