import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals("abc", Solution().minWindow("abc", "ac"))
    }

    @Test
    fun BasicTest2() {
        assertEquals("banc", Solution().minWindow("adobecodebanc", "abc"))
    }

    @Test
    fun BasicTest3() {
        assertEquals("abcdec", Solution().minWindow("abcdecf", "acc"))
    }

    @Test
    fun BasicTest4() {
        assertEquals("", Solution().minWindow("", "a"))
    }

    @Test
    fun BasicTest5() {
        assertEquals(
            "",
            Solution().minWindow("adfqeradboaf23098724huhfda923hadf78adfhadfhadfaodiyfas8", "dfje89affefy8f")
        )
    }
}
