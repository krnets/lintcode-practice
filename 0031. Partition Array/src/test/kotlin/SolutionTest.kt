import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(0, Solution().partitionArray(intArrayOf(), 9))
    }

    @Test
    fun BasicTest2() {
        assertEquals(1, Solution().partitionArray(intArrayOf(3, 2, 2, 1), 2))
    }

    @Test
    fun BasicTest3() {
        assertEquals(12, Solution().partitionArray(intArrayOf(7, 7, 9, 8, 6, 6, 8, 7, 9, 8, 6, 6), 10))
    }

    @Test
    fun BasicTest4() {
        assertEquals(10, Solution().partitionArray(intArrayOf(9, 9, 9, 8, 9, 8, 7, 9, 8, 8, 8, 9, 8, 9, 8, 8, 6, 9), 9))
    }
}
