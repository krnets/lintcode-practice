import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val a = intArrayOf(1, 2, 3, 4, 5, 6)
        val q = arrayOf(intArrayOf(1, 2), intArrayOf(1, 5))
        val expected = intArrayOf(2, 5)
        assertContentEquals(expected, Solution().getAns(a, q))
    }

    @Test
    fun BasicTest2() {
        val a = intArrayOf(1, 5, 3, 3, 3, 2)
        val q = arrayOf(intArrayOf(1, 2))
        val expected = intArrayOf(2)
        assertContentEquals(expected, Solution().getAns(a, q))
    }

    @Test
    fun BasicTest3() {
        val a = intArrayOf(1, 90, 58, 34, 47, 25, 8, 72, 82, 38, 37, 68, 50, 11, 97, 68, 24, 65, 5)
        val q = arrayOf(
            intArrayOf(68, 100), intArrayOf(3, 91), intArrayOf(25, 86), intArrayOf(32, 36), intArrayOf(54, 78),
            intArrayOf(39, 51), intArrayOf(50, 62), intArrayOf(62, 99), intArrayOf(33, 36), intArrayOf(51, 94),
        )
        val expected = intArrayOf(6,17,12,1,5,2,2,7,1,7)
        assertContentEquals(expected, Solution().getAns(a, q))
    }
}
