import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val expected = listOf(
            "BANANA",
            ".P....",
            ".P....",
            ".L....",
            ".E...."
        )
        assertEquals(expected, Solution().characterGrid("BANANA", "APPLE"))
    }

    @Test
    fun BasicTest2() {
        val expected = listOf(
            "R.......",
            "E.......",
            "C.......",
            "TRIANGLE",
            "A.......",
            "N.......",
            "G.......",
            "L.......",
            "E......."
        )
        assertEquals(expected, Solution().characterGrid("TRIANGLE", "RECTANGLE"))
    }

    @Test
    fun BasicTest3() {
        val expected = listOf(
            ".C..",
            ".C..",
            "ABBA",
            ".B.."
        )
        assertEquals(expected, Solution().characterGrid("ABBA", "CCBB"))
    }
}
