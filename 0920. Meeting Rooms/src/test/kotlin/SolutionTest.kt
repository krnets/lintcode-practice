import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val intervals = listOf(Interval(0, 30), Interval(5, 10), Interval(15, 20))
        assertFalse(Solution().canAttendMeetings(intervals))
    }

    @Test
    fun BasicTest2() {
        val intervals = listOf(Interval(5, 8), Interval(9, 15))
        assertTrue(Solution().canAttendMeetings(intervals))
    }

    @Test
    fun BasicTest3() {
        val intervals = listOf(Interval(0, 8), Interval(8, 10))
        assertTrue(Solution().canAttendMeetings(intervals))
    }

    @Test
    fun BasicTest4() {
        val intervals = listOf(
            Interval(465, 497),
            Interval(386, 462),
            Interval(354, 380),
            Interval(134, 189),
            Interval(199, 282),
            Interval(18, 104),
            Interval(499, 562),
            Interval(4, 14),
            Interval(111, 129),
            Interval(292, 345)
        )
        assertTrue(Solution().canAttendMeetings(intervals))
    }
}
