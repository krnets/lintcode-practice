import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertTrue(Solution().isNumber("0"))
    }

    @Test
    fun BasicTest2() {
        assertTrue(Solution().isNumber("0.1"))
    }

    @Test
    fun BasicTest3() {
        assertTrue(Solution().isNumber(".1"))
    }

    @Test
    fun BasicTest4() {
        assertTrue(Solution().isNumber("2."))
    }

    @Test
    fun BasicTest5() {
        assertTrue(Solution().isNumber("2e10"))
    }

    @Test
    fun BasicTest6() {
        assertFalse(Solution().isNumber("e9"))
    }

    @Test
    fun BasicTest7() {
        assertFalse(Solution().isNumber("abc"))
    }

    @Test
    fun BasicTest8() {
        assertFalse(Solution().isNumber("1 a"))
    }

    @Test
    fun BasicTest9() {
        assertTrue(Solution().isNumber("1 "))
    }

    @Test
    fun BasicTest10() {
        assertTrue(Solution().isNumber(" 0"))
    }

    @Test
    fun BasicTest11() {
        assertTrue(Solution().isNumber("+.8"))
    }
}
