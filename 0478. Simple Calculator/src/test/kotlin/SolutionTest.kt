import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(3, Calculator().calculate(1, '+', 2))
        assertEquals(200, Calculator().calculate(10, '*', 20))
        assertEquals(1, Calculator().calculate(3, '/', 2))
        assertEquals(-1, Calculator().calculate(10, '-', 11))
        assertEquals(10, Calculator().calculate(10, '%', 11))
        assertEquals(0, Calculator().calculate(10, '#', 11))
        assertEquals(2147483647, Calculator().calculate(10, '^', 11))
    }
}
