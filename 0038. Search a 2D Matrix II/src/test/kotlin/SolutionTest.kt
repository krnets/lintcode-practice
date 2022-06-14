import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val matrix = arrayOf(intArrayOf(3, 4))
        assertEquals(1, Solution().searchMatrix(matrix, 3))
    }

    @Test
    fun BasicTest2() {
        val matrix = arrayOf(intArrayOf(1, 3, 5, 7), intArrayOf(2, 4, 7, 8), intArrayOf(3, 5, 9, 10))
        assertEquals(2, Solution().searchMatrix(matrix, 3))
    }
}
