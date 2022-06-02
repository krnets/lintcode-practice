import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(1, Solution().digitCounts(1, 1))
    }

    @Test
    fun BasicTest2() {
        assertEquals(5, Solution().digitCounts(1, 12))
    }
}
