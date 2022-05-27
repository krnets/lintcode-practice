import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(14, Solution().dropEggs(100))
        assertEquals(4, Solution().dropEggs(10))
        assertEquals(65536, Solution().dropEggs(2147483647))
    }
}
