import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals('B', Solution().findLetter("aAbBcD"))
        assertEquals('~', Solution().findLetter("looGVSSPbR"))
    }
}
