import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        var res = Solution().productExcludeItself(listOf(1, 2, 3))
        assertArrayEquals(longArrayOf(6, 3, 2), res.toLongArray())
    }

    @Test
    fun BasicTest2() {
        var res = Solution().productExcludeItself(listOf(2, 4, 6))
        assertArrayEquals(longArrayOf(24, 12, 8), res.toLongArray())
    }
}
