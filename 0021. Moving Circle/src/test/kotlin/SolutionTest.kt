import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(1, Solution().ifIntersect(doubleArrayOf(0.0, 0.0, 2.5, 3.0, 2.0, 0.5, 0.0, 2.0)))
        assertEquals(-1, Solution().ifIntersect(doubleArrayOf(0.0, 0.0, 2.0, 5.0, 0.0, 1.0, 0.0, 2.0)))
        assertEquals(-1, Solution().ifIntersect(doubleArrayOf(2.0, 0.0, 3.0, 2.0, 2.0, 0.5, 0.0, 2.0)))
    }
}
