import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertFalse(Solution().isUnique("abc_____"))
        assertTrue(Solution().isUnique("abc"))
    }
}
