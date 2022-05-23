import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("blue is sky the", Solution().reverseWords("the sky is blue"))
        assertEquals("world hello", Solution().reverseWords("hello world"))
        assertEquals("", Solution().reverseWords(" "))

        assertEquals(
            "want. we joys the us give always doesn't Life",
            Solution().reverseWords("  Life  doesn't  always    give     us  the       joys we want.")
        )
    }
}
