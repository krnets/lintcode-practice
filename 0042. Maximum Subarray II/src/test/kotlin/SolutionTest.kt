import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(7, Solution().maxTwoSubArrays(listOf(1, 3, -1, 2, -1, 2)))
    }

    @Test
    fun BasicTest2() {
        assertEquals(9, Solution().maxTwoSubArrays(listOf(5, 4)))
    }
}
