import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(5234, Solution().insertFive(234))
        assertEquals(555555, Solution().insertFive(55555))
        assertEquals(-45937, Solution().insertFive(-4937))
        assertEquals(-555555, Solution().insertFive(-55555))
        assertEquals(-5458, Solution().insertFive(-548))
        assertEquals(5653, Solution().insertFive(563))
    }
}
