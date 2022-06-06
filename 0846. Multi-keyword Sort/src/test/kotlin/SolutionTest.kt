import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        val array = arrayOf(intArrayOf(2, 50), intArrayOf(1, 50), intArrayOf(3, 100))
        val expected = arrayOf(intArrayOf(3, 100), intArrayOf(1, 50), intArrayOf(2, 50))
        val actual = Solution().multiSort(array)

        for (i in array.indices)
            println(assertContentEquals(expected[i], actual[i]))
    }
}
