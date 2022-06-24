import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val words = arrayOf(
            "yes", "lint", "code",
            "yes", "code", "baby",
            "you", "baby", "chrome",
            "safari", "lint", "code",
            "body", "lint", "code"
        )
        assertContentEquals(arrayOf("code", "lint", "baby"), Solution().topKFrequentWords(words, 3))
    }

    @Test
    fun BasicTest2() {
        val words = arrayOf(
            "yes", "lint", "code",
            "yes", "code", "baby",
            "you", "baby", "chrome",
            "safari", "lint", "code",
            "body", "lint", "code"
        )
        assertContentEquals(arrayOf("code", "lint", "baby", "yes"), Solution().topKFrequentWords(words, 4))
    }
}
