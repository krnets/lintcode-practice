import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertTrue(Solution().wordPattern("abba", "dog cat cat dog"))
    }

    @Test
    fun BasicTest2() {
        assertFalse(Solution().wordPattern("abba", "dog cat cat fish"))
    }

    @Test
    fun BasicTest3() {
        assertFalse(Solution().wordPattern("aaaa", "dog cat cat dog"))
    }

    @Test
    fun BasicTest4() {
        assertFalse(Solution().wordPattern("abba", "dog dog dog dog"))
    }
}
