import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val expected = listOf("a1b2", "a1B2", "A1b2", "A1B2")
        assertContentEquals(expected, Solution().letterCasePermutation("a1b2"))
    }

    @Test
    fun BasicTest2() {
        val expected = listOf("3z4", "3Z4")
        assertContentEquals(expected, Solution().letterCasePermutation("3z4"))
    }

    @Test
    fun BasicTest3() {
        val expected = listOf("12345")
        assertContentEquals(expected, Solution().letterCasePermutation("12345"))
    }

    @Test
    fun BasicTest4() {
        val expected = listOf("")
        assertContentEquals(expected, Solution().letterCasePermutation(""))
    }

    @Test
    fun BasicTest5() {
        val expected = listOf("sa2d", "sa2D", "sA2d", "sA2D", "Sa2d", "Sa2D", "SA2d", "SA2D")
        assertContentEquals(expected, Solution().letterCasePermutation("SA2D"))
    }
}
