import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals('A', Solution().lowercaseToUppercase('a'))
        assertEquals('B', Solution().lowercaseToUppercase('b'))
    }
}
