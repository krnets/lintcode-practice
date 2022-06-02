import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val board = listOf(
            "53..7....",
            "6..195...",
            ".98....6.",
            "8...6...3",
            "4..8.3..1",
            "7...2...6",
            ".6....28.",
            "...419..5",
            "....8..79"
        ).map { it.toCharArray() }.toTypedArray()
        assertTrue(Solution().isValidSudoku(board))
    }

    @Test
    fun BasicTest2() {
        val board = listOf(
            "53..75...",
            "6..195...",
            ".98....6.",
            "8...6...3",
            "4..8.3..1",
            "7...2...6",
            ".6....28.",
            "...419..5",
            "....8..79"
        ).map { it.toCharArray() }.toTypedArray()
        assertFalse(Solution().isValidSudoku(board))
    }

    @Test
    fun BasicTest3() {
        val board = listOf(
            "....5..1.",
            ".4.3.....",
            ".....3..1",
            "8......2.",
            "..2.7....",
            ".15......",
            ".....2...",
            ".2.9.....",
            "..4......"
        ).map { it.toCharArray() }.toTypedArray()
        assertFalse(Solution().isValidSudoku(board))
    }
}
