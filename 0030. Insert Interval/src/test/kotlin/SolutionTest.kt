import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val intervals = listOf(Interval(1, 2), Interval(5, 9))
        val expected = listOf(Interval(1, 9))
        val actual = Solution().insert(intervals, Interval(2, 5))
        testIntervalResults(expected, actual)
    }

    @Test
    fun BasicTest2() {
        val intervals = listOf(Interval(1, 2), Interval(5, 9))
        val expected = listOf(Interval(1, 2), Interval(3, 4), Interval(5, 9))
        val actual = Solution().insert(intervals, Interval(3, 4))
        testIntervalResults(expected, actual)
    }

    @Test
    fun BasicTest3() {
        val intervals = listOf(Interval(1, 5))
        val expected = listOf(Interval(1, 7))
        val actual = Solution().insert(intervals, Interval(5, 7))
        testIntervalResults(expected, actual)
    }

    @Test
    fun BasicTest4() {
        val intervals = listOf(Interval(1, 5))
        val expected = listOf(Interval(1, 5), Interval(6, 8))
        val actual = Solution().insert(intervals, Interval(6, 8))
        testIntervalResults(expected, actual)
    }

    @Test
    fun BasicTest5() {
        val intervals = listOf(Interval(1, 5))
        val expected = listOf(Interval(0, 0), Interval(1, 5))
        val actual = Solution().insert(intervals, Interval(0, 0))
        testIntervalResults(expected, actual)
    }

    @Test
    fun BasicTest6() {
        val intervals = listOf(Interval(1, 5))
        val expected = listOf(Interval(0, 5))
        val actual = Solution().insert(intervals, Interval(0, 3))
        testIntervalResults(expected, actual)
    }

    @Test
    fun BasicTest7() {
        val intervals = listOf(Interval(1, 5), Interval(6, 8))
        val expected = listOf(Interval(0, 9))
        val actual = Solution().insert(intervals, Interval(0, 9))
        testIntervalResults(expected, actual)
    }

    @Test
    fun BasicTest8() {
        val intervals = listOf(Interval(1, 5), Interval(6, 8))
        val expected = listOf(Interval(1, 8))
        val actual = Solution().insert(intervals, Interval(2, 7))
        testIntervalResults(expected, actual)
    }

    @Test
    fun BasicTest9() {
        val intervals = listOf(Interval(1, 5), Interval(6, 8))
        val expected = listOf(Interval(0, 9))
        val actual = Solution().insert(intervals, Interval(0, 9))
        testIntervalResults(expected, actual)
    }

    @Test
    fun BasicTest10() {
        val intervals = listOf(Interval(1, 5), Interval(7, 8), Interval(10, 13))
        val expected = listOf(Interval(0, 9), Interval(10, 13))
        val actual = Solution().insert(intervals, Interval(0, 9))
        testIntervalResults(expected, actual)
    }

    private fun testIntervalResults(expected: List<Interval>, actual: List<Interval?>) {
        for (i in expected.indices) {
            assertEquals(expected.size, actual.size)
            assertEquals(expected[i].start, actual[i]!!.start)
            assertEquals(expected[i].end, actual[i]!!.end)
        }
    }
}
