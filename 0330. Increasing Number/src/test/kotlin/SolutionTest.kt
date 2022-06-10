import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(789, Solution().getIncreasingNumber(998))
    }

    @Test
    fun BasicTest2() {
        assertEquals(1289, Solution().getIncreasingNumber(1341))
    }

    @Test
    fun BasicTest3() {
        assertEquals(89, Solution().getIncreasingNumber(100))
    }
}
