import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12)
        )
        val expected = intArrayOf(1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12)

        assertContentEquals(expected, Solution().printZMatrix(matrix))
    }
}
