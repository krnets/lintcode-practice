import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(intArrayOf(0, 1, 9, 16, 100), Solution().squareArray(intArrayOf(-4, -1, 0, 3, 10)))
        assertContentEquals(intArrayOf(4, 9, 9, 49, 121), Solution().squareArray(intArrayOf(-7, -3, 2, 3, 11)))
    }
}
