import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertTrue(Solution().permutation("abcd", "bcad"))
        assertFalse(Solution().permutation("aac", "abc"))
    }
}
