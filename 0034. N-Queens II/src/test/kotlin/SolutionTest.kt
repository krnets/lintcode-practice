import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().totalNQueens(1))
        assertEquals(2, Solution().totalNQueens(4))
    }
}
