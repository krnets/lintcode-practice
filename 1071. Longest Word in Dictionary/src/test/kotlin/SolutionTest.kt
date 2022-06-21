import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val words = arrayOf("w", "wo", "wor", "worl", "world")
        assertEquals("world", Solution().longestWord(words))
    }

    @Test
    fun BasicTest2() {
        val words = arrayOf("a", "banana", "app", "appl", "ap", "apply", "apple")
        assertEquals("apple", Solution().longestWord(words))
    }
}
