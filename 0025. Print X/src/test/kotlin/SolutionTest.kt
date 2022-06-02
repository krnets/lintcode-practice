import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(listOf("X"), Solution().printX(1))
        assertEquals(listOf("XX", "XX"), Solution().printX(2))
        assertEquals(listOf("X X", " X ", "X X"), Solution().printX(3))
        assertEquals(listOf("X  X", " XX ", " XX ", "X  X"), Solution().printX(4))
        assertEquals(listOf("X   X", " X X ", "  X  ", " X X ", "X   X"), Solution().printX(5))
    }
}
