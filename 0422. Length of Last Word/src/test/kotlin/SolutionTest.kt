import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(5, Solution().lengthOfLastWord("Hello World"))
    }

    @Test
    fun BasicTest2() {
        assertEquals(8, Solution().lengthOfLastWord("Hello LintCode"))
    }

    @Test
    fun BasicTest3() {
        assertEquals(1, Solution().lengthOfLastWord("a"))
    }

    @Test
    fun BasicTest4() {
        assertEquals(1, Solution().lengthOfLastWord("b a "))
    }

    @Test
    fun BasicTest5() {
        assertEquals(5, Solution().lengthOfLastWord(" TJqWC"))
    }

    @Test
    fun BasicTest6() {
        assertEquals(0, Solution().lengthOfLastWord(""))
    }

    @Test
    fun BasicTest7() {
        assertEquals(10, Solution().lengthOfLastWord("AumsdgOVRB"))
    }
}
