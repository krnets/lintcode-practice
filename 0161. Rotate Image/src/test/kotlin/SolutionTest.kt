import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val matrix = arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16)
        )
        val expected = arrayOf(
            intArrayOf(15, 13, 2, 5),
            intArrayOf(14, 3, 4, 1),
            intArrayOf(12, 6, 8, 9),
            intArrayOf(16, 7, 10, 11),
        )
        Solution().rotate(matrix)

        for (i in matrix.indices)
            assertContentEquals(expected[i], matrix[i])
    }

    @Test
    fun BasicTest2() {
        val matrix = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
        val expected = arrayOf(intArrayOf(3, 1), intArrayOf(4, 2))
        Solution().rotate(matrix)

        for (i in matrix.indices)
            assertContentEquals(expected[i], matrix[i])
    }

    @Test
    fun BasicTest3() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val expected = arrayOf(intArrayOf(7, 4, 1), intArrayOf(8, 5, 2), intArrayOf(9, 6, 3))
        Solution().rotate(matrix)

        for (i in matrix.indices)
            assertContentEquals(expected[i], matrix[i])
    }

    @Test
    fun BasicTest4() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 7, 8),
            intArrayOf(9, 10, 11, 12),
            intArrayOf(13, 14, 15, 16)
        )
        val expected = arrayOf(
            intArrayOf(13, 9, 5, 1),
            intArrayOf(14, 10, 6, 2),
            intArrayOf(15, 11, 7, 3),
            intArrayOf(16, 12, 8, 4)
        )
        Solution().rotate(matrix)

        for (i in matrix.indices)
            assertContentEquals(expected[i], matrix[i])
    }

    @Test
    fun BasicTest5() {
        val matrix = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(6, 7, 8, 9, 10),
            intArrayOf(11, 12, 13, 14, 15),
            intArrayOf(16, 17, 18, 19, 20),
            intArrayOf(21, 22, 23, 24, 25)
        )
        val expected = arrayOf(
            intArrayOf(21, 16, 11, 6, 1),
            intArrayOf(22, 17, 12, 7, 2),
            intArrayOf(23, 18, 13, 8, 3),
            intArrayOf(24, 19, 14, 9, 4),
            intArrayOf(25, 20, 15, 10, 5),
        )
        Solution().rotate(matrix)

        for (i in matrix.indices)
            assertContentEquals(expected[i], matrix[i])
    }
}
