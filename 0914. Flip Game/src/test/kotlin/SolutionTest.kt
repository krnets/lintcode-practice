import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val expected = listOf(
            "--++",
            "+--+",
            "++--"
        )
        assertContentEquals(expected, Solution().generatePossibleNextMoves("++++"))
    }

    @Test
    fun BasicTest2() {
        val expected = listOf(
            "-----+-+++-+",
            "---+---+++-+",
            "---+++---+-+",
            "---+++-+---+"
        )
        assertContentEquals(expected, Solution().generatePossibleNextMoves("---+++-+++-+"))
    }
}
