import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun `1 Queen`() {
        val expected = listOf(listOf("Q"))
        val actual = Solution().solveNQueens(1)

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }

    @Test
    fun `4 Queens`() {
        val expected = listOf(
            listOf(".Q..", "...Q", "Q...", "..Q."),
            listOf("..Q.", "Q...", "...Q", ".Q..")
        )
        val actual = Solution().solveNQueens(4)

        for (i in expected.indices)
            assertContentEquals(expected[i], actual[i])
    }
}
