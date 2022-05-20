import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Solution().aplusb(1, 2))
        assertEquals(0, Solution().aplusb(1, -1))
        assertEquals(802, Solution().aplusb(765, 37))
        assertEquals(728, Solution().aplusb(765, -37))
    }
}
