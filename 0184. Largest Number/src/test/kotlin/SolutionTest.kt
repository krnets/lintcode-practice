import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("8423201", Solution().largestNumber(intArrayOf(1, 20, 23, 4, 8)))
        assertEquals("6654", Solution().largestNumber(intArrayOf(4, 6, 65)))
        assertEquals("0", Solution().largestNumber(intArrayOf(0, 0)))
        assertEquals("29529", Solution().largestNumber(intArrayOf(29, 295)))
    }
}
