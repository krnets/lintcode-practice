import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertArrayEquals(intArrayOf(0, 1), Solution().twoSum(intArrayOf(2, 7, 11, 15), 9))
        assertArrayEquals(intArrayOf(1, 2), Solution().twoSum(intArrayOf(15, 2, 7, 11), 9))
    }
}
