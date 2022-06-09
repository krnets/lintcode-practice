import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("deabchfgi", Solution().reformatString("abcdefghi", intArrayOf(3, 2, 2, 1, 1)))
//        abcdefghi
//        3, 2, 2, 1, 1

//        abc, de, fg, h, i
//        de, abc, h, fg, i

//        deabchfgi
    }
}
