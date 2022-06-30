import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(listOf(1, 5), Solution().singleNumberIII(intArrayOf(1, 2, 2, 3, 4, 4, 5, 3)))
        assertEquals(listOf(2, 3), Solution().singleNumberIII(intArrayOf(1, 1, 2, 3, 4, 4)))
    }
}
