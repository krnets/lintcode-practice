import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertArrayEquals(intArrayOf(1, 3, 2, 4), Solution().interleavedArray(intArrayOf(1, 2), intArrayOf(3, 4)))
    }
}
