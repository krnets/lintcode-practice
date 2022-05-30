import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertArrayEquals(intArrayOf(3, 4, 6), Solution().getUniqueArray(intArrayOf(3, 4, 3, 6)))
    }
}
