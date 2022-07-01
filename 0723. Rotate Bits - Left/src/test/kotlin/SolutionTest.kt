import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals(1968, Solution().leftRotate(123, 4))
//        0000,0000,0000,0000,0000,0000,0111,1010  -->
//        0000,0000,0000,0000,0000,0111,1010,0000
    }

    @Test
    fun BasicTest2() {
        assertEquals(32512, Solution().leftRotate(127, 8))
//        0000,0000,0000,0000,0000,0000,1111,1111  -->
//        0000,0000,0000,0000,1111,1111,0000,0000
    }
}
