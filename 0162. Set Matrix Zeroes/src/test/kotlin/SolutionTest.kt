import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val matrix = arrayOf(intArrayOf(1, 2), intArrayOf(0, 3))
        val expected = arrayOf(intArrayOf(0, 2), intArrayOf(0, 0))
        Solution().setZeroes(matrix)

        for (i in matrix.indices)
            assertContentEquals(expected[i], matrix[i])
    }

    @Test
    fun BasicTest2() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 0, 6), intArrayOf(7, 8, 9))
        val expected = arrayOf(intArrayOf(1, 0, 3), intArrayOf(0, 0, 0), intArrayOf(7, 0, 9))
        Solution().setZeroes(matrix)

        for (i in matrix.indices)
            assertContentEquals(expected[i], matrix[i])
    }
}
