import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        val triangle = listOf(intArrayOf(1), intArrayOf(1, 1), intArrayOf(1, 2, 1), intArrayOf(1, 3, 3, 1))
        val actual = Solution().calcYangHuisTriangle(4)

        for (i in triangle.indices)
            assertContentEquals(triangle[i], actual[i])
    }
}
