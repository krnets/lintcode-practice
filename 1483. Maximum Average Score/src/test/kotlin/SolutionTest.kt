import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val names = listOf("bob", "ted", "ted")
        val grades = intArrayOf(88, 100, 20)
        assertEquals(88.0, Solution().maximumAverageScore(names, grades))
    }

    @Test
    fun BasicTest2() {
        val names = listOf("john", "xisa", "xisa", "liajd", "alice", "john", "xisa", "mark", "ted", "xlisa")
        val grades = intArrayOf(95, 83, 33, 50, 78, 91, 80, 67, 85, 87)
        assertEquals(93.0, Solution().maximumAverageScore(names, grades))
    }
}
