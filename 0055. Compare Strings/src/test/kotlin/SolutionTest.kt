import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(true, Solution().compareStrings("ABCD", "ACD"))
        assertEquals(false, Solution().compareStrings("ABCD", "AABC"))
    }
}
