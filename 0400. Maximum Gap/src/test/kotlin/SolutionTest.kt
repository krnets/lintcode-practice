import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(4, Solution().maximumGap(intArrayOf(1, 9, 2, 5)))
        assertEquals(0, Solution().maximumGap(intArrayOf(1)))
    }
}
