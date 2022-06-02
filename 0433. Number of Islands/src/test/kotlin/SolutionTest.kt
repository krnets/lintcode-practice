import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val grid = listOf(
            intArrayOf(1, 1, 0, 0, 0),
            intArrayOf(0, 1, 0, 0, 1),
            intArrayOf(0, 0, 0, 1, 1),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 1)
        ).map { it.map { x -> x == 1 }.toBooleanArray() }.toTypedArray()
        assertEquals(3, Solution().numIslands(grid))
    }

    @Test
    fun BasicTest2() {
        val grid = arrayOf(booleanArrayOf(true, true))
        assertEquals(1, Solution().numIslands(grid))
    }
}
