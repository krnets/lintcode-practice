import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val words = arrayOf("hello", "leetcode")
        val order = "hlabcdefgijkmnopqrstuvwxyz"
        assertTrue(Solution().isAlienSorted(words, order))
    }

    @Test
    fun BasicTest2() {
        val words = arrayOf("word", "world", "row")
        val order = "worldabcefghijkmnpqstuvxyz"
        assertFalse(Solution().isAlienSorted(words, order))
    }

    @Test
    fun BasicTest3() {
        val words = arrayOf("apple", "app")
        val order = "abcdefghijklmnopqrstuvwxyz"
        assertFalse(Solution().isAlienSorted(words, order))
    }
}
