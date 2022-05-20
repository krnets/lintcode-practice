import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(listOf(1, 2, 3, 4), Solution().generate(4))
    }
}
