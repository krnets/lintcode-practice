import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(false, Solution().searchMatrix(arrayOf(intArrayOf(5)), target = 2))

        assertEquals(
            true, Solution().searchMatrix(
                arrayOf(
                    intArrayOf(1, 3, 5, 7),
                    intArrayOf(10, 11, 16, 20),
                    intArrayOf(23, 30, 34, 50)
                ), target = 3
            )
        )
    }
}
