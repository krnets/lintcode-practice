import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(
            7, Solution().minPathSum(
                arrayOf(
                    intArrayOf(1, 3, 1),
                    intArrayOf(1, 5, 1),
                    intArrayOf(4, 2, 1)
                )
            )
        )
    }

    @Test
    fun BasicTest2() {
        assertEquals(
            6, Solution().minPathSum(
                arrayOf(
                    intArrayOf(1, 3, 2),
                )
            )
        )
    }
}
