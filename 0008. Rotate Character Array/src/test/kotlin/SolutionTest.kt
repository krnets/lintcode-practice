import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        var chars = "abcdefg".toCharArray()
        var ans = "efgabcd".toCharArray()
        Solution().rotateString(chars, 3)
        assertArrayEquals(ans, chars)

        chars = "abcdefg".toCharArray()
        ans = "abcdefg".toCharArray()
        Solution().rotateString(chars, 0)
        assertArrayEquals(ans, chars)

        chars = "".toCharArray()
        ans = "".toCharArray()
        Solution().rotateString(chars, 10)
        assertArrayEquals(ans, chars)

        chars = "cppjavapy".toCharArray()
        ans = "pjavapycp".toCharArray()
        Solution().rotateString(chars, 25)
        assertArrayEquals(ans, chars)
    }
}
