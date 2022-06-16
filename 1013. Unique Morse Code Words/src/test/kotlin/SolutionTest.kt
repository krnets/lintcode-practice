import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val words = arrayOf("gin", "zen", "gig", "msg")
        assertEquals(2, Solution().uniqueMorseRepresentations(words))
    }

    @Test
    fun BasicTest2() {
        val words = arrayOf("a", "b")
        assertEquals(2, Solution().uniqueMorseRepresentations(words))
    }
}
