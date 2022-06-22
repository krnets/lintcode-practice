import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
        val banned = arrayOf("hit")
        assertEquals("ball", Solution().mostCommonWord(paragraph, banned))
    }

    @Test
    fun BasicTest2() {
        val paragraph = "a a a b b c c d"
        val banned = arrayOf("a", "b")
        assertEquals("c", Solution().mostCommonWord(paragraph, banned))
    }
}
