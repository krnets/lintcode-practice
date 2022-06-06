import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val words = arrayOf("abcd", "bnrt", "crmy", "dtye");
        assertTrue(Solution().validWordSquare(words))
    }

    @Test
    fun BasicTest2() {
        val words = arrayOf("abcd", "bnrt", "crm", "dt");
        assertTrue(Solution().validWordSquare(words))
    }

    @Test
    fun BasicTest3() {
        val words = arrayOf("ball", "area", "read", "lady");
        assertFalse(Solution().validWordSquare(words))
    }
}
