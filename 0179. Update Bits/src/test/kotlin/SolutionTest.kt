import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(1108, Solution().updateBits(1024, 21, 2, 6))
        assertEquals(1148, Solution().updateBits(1024, 31, 2, 6))
        assertEquals(-1, Solution().updateBits(1, -1, 0, 31))
    }

    @Test
    fun BasicTest2() {
        assertEquals(0b10001010100, Solution().updateBits(0b10000000000, 0b10101, 2, 6))
        assertEquals(0b10001111100, Solution().updateBits(0b10000000000, 0b11111, 2, 6))
        assertEquals(
            0b1111111111111111111111111111111,
            Solution().updateBits(0b00000001, 0b1111111111111111111111111111111, 0, 31)
        )
    }
}
