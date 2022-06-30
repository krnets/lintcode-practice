import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("abcaaa", Solution().expressionExpand("abc3[a]"))
//        assertEquals("adadpfpfpfadadpfpfpfadadpfpfpfxyz", Solution().expressionExpand("3[2[ad]3[pf]]xyz"))
    }
}
