import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertContentEquals(doubleArrayOf(12.56, 12.56), Solution().calculate(2))
        assertContentEquals(doubleArrayOf(18.84, 28.27), Solution().calculate(3))
    }
}
