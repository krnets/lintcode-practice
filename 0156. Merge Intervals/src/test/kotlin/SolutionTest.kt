import org.junit.Test
import kotlin.test.assertTrue

class SolutionTest {

    @Test
    fun BasicTest1() {
        val intervals = Solution().merge(
            listOf(
                Interval(1, 3),
                Interval(2, 6),
                Interval(8, 10),
                Interval(15, 18)
            )
        )
        val expected = listOf(Interval(1, 6), Interval(8, 10), Interval(15, 18))
        val ans = intervals.zip(expected).all { it.first!!.start == it.second.start && it.first!!.end == it.second.end }
        assertTrue(ans)
    }

    @Test
    fun BasicTest2() {
        val intervals = Solution().merge(listOf(Interval(1, 3)))
        val expected = listOf(Interval(1, 3))
        val ans = intervals.zip(expected).all { it.first!!.start == it.second.start && it.first!!.end == it.second.end }
        assertTrue(ans)
    }

    @Test
    fun BasicTest3() {
        val intervals = Solution().merge(listOf<Interval>())
        val expected = listOf<Interval>()
        val ans = intervals.zip(expected).all { it.first!!.start == it.second.start && it.first!!.end == it.second.end }
        assertTrue(ans)
    }

    @Test
    fun BasicTest4() {
        val intervals = Solution().merge(
            listOf(
                Interval(2, 3),
                Interval(4, 5),
                Interval(6, 7),
                Interval(8, 9),
                Interval(1, 10)
            )
        )
        val expected = listOf(Interval(1, 10))
        val ans = intervals.zip(expected).all { it.first!!.start == it.second.start && it.first!!.end == it.second.end }
        assertTrue(ans)
    }
}
