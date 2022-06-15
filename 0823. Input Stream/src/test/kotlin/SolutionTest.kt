import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals("YES", Solution().inputStream("abcde<<", "abcd<e<"))
    }

    @Test
    fun BasicTest2() {
        assertEquals("NO", Solution().inputStream("a<<bc", "abc<"))
    }

    @Test
    fun BasicTest3() {
        assertEquals("YES", Solution().inputStream("<<<<<<<", "<<<<"))
    }
}
