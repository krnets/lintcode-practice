import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val widths = intArrayOf(
            10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
            10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10
        )
        val s = "abcdefghijklmnopqrstuvwxyz"
        assertContentEquals(intArrayOf(3, 60), Solution().numberOfLines(widths, s))
    }

    @Test
    fun BasicTest2() {
        val widths = intArrayOf(
            4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
            10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10
        )
        val s = "bbbcccdddaaa"
        assertContentEquals(intArrayOf(2, 4), Solution().numberOfLines(widths, s))
    }
}
