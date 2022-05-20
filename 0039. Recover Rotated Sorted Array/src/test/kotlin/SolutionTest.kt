import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val original = mutableListOf(4, 5, 1, 2, 3)
        val expected = intArrayOf(1, 2, 3, 4, 5)
        Solution().recoverRotatedSortedArray(original)
        assertArrayEquals(expected, original.toIntArray())
    }
}
