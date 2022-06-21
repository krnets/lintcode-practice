import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val A = "this apple is sweet"
        val B = "this apple is sour"
        val expected = arrayOf("sweet", "sour")
        assertContentEquals(expected, Solution().uncommonFromSentences(A, B))
    }

    @Test
    fun BasicTest2() {
        val A = "apple apple"
        val B = "banana"
        val expected = arrayOf("banana")
        assertContentEquals(expected, Solution().uncommonFromSentences(A, B))
    }
}
