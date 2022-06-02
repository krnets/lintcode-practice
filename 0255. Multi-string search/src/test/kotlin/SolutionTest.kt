import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val actual = Solution().whetherStringsAreSubstrings("abc", arrayOf("ab", "cd"))
        val expected = listOf(true, false)
        assertTrue((actual.size == expected.size) and (expected.zip(actual.toList()).all { it.first == it.second }))
    }

    @Test
    fun BasicTest2() {
        val actual = Solution().whetherStringsAreSubstrings("lintcode", arrayOf("lint", "code", "codes"))
        val expected = listOf(true, true, false)
        assertTrue((actual.size == expected.size) and (expected.zip(actual.toList()).all { it.first == it.second }))
    }
}
