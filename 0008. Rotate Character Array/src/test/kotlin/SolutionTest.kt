import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTests() {
        var chars = "abcdefg".toCharArray()
        var ans = "efgabcd".toCharArray()
        Solution().rotateString(chars, 3)
        assertContentEquals(ans, chars)

        chars = "abcdefg".toCharArray()
        ans = "abcdefg".toCharArray()
        Solution().rotateString(chars, 0)
        assertContentEquals(ans, chars)

        chars = "".toCharArray()
        ans = "".toCharArray()
        Solution().rotateString(chars, 10)
        assertContentEquals(ans, chars)

        chars = "cppjavapy".toCharArray()
        ans = "pjavapycp".toCharArray()
        Solution().rotateString(chars, 25)
        assertContentEquals(ans, chars)
    }
}
