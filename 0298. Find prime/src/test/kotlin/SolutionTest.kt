import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(listOf(2, 3, 5), Solution().prime(5))
    }
}
