import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(listOf(1), Solution().getRow(0))
        assertContentEquals(listOf(1, 1), Solution().getRow(1))
        assertContentEquals(listOf(1, 2, 1), Solution().getRow(2))
        assertContentEquals(listOf(1, 3, 3, 1), Solution().getRow(3))
        assertContentEquals(listOf(1, 4, 6, 4, 1), Solution().getRow(4))
        assertContentEquals(listOf(1, 5, 10, 10, 5, 1), Solution().getRow(5))
        assertContentEquals(listOf(1, 6, 15, 20, 15, 6, 1), Solution().getRow(6))
        assertContentEquals(listOf(1, 7, 21, 35, 35, 21, 7, 1), Solution().getRow(7))
        assertContentEquals(listOf(1, 8, 28, 56, 70, 56, 28, 8, 1), Solution().getRow(8))
        assertContentEquals(listOf(1, 9, 36, 84, 126, 126, 84, 36, 9, 1), Solution().getRow(9))
        assertContentEquals(listOf(1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1), Solution().getRow(10))
        assertContentEquals(listOf(1, 11, 55, 165, 330, 462, 462, 330, 165, 55, 11, 1), Solution().getRow(11))
        assertContentEquals(listOf(1, 12, 66, 220, 495, 792, 924, 792, 495, 220, 66, 12, 1), Solution().getRow(12))

        assertContentEquals(
            listOf(1, 13, 78, 286, 715, 1287, 1716, 1716, 1287, 715, 286, 78, 13, 1),
            Solution().getRow(13)
        )
        assertContentEquals(
            listOf(1, 14, 91, 364, 1001, 2002, 3003, 3432, 3003, 2002, 1001, 364, 91, 14, 1),
            Solution().getRow(14)
        )
        assertContentEquals(
            listOf(
                1, 21, 210, 1330, 5985, 20349, 54264, 116280, 203490, 293930, 352716,
                352716, 293930, 203490, 116280, 54264, 20349, 5985, 1330, 210, 21, 1
            ),
            Solution().getRow(21)
        )
    }
}
