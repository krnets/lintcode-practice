import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals('A', Solution().lowercaseToUppercase('a'))
        assertEquals('B', Solution().lowercaseToUppercase('b'))
    }
}
