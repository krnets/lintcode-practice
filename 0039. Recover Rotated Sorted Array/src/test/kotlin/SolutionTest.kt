import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val original = mutableListOf(4, 5, 1, 2, 3)
        val expected = intArrayOf(1, 2, 3, 4, 5)
        Solution().recoverRotatedSortedArray(original)
        assertContentEquals(expected, original.toIntArray())
    }
}
