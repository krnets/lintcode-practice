import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), Solution().getNarcissisticNumbers(1))
        assertContentEquals(listOf(), Solution().getNarcissisticNumbers(2))
        assertContentEquals(listOf(153, 370, 371, 407), Solution().getNarcissisticNumbers(3))
        assertContentEquals(listOf(1634, 8208, 9474), Solution().getNarcissisticNumbers(4))
    }
}
