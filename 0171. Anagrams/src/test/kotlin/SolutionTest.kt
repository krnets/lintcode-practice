import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertContentEquals(
            listOf("lint", "intl", "inlt"),
            Solution().anagrams(arrayOf("lint", "intl", "inlt", "code"))
        )
    }

    @Test
    fun BasicTest2() {
        assertContentEquals(
            listOf("ab", "ba", "cd", "dc"),
            Solution().anagrams(arrayOf("ab", "ba", "cd", "dc", "e"))
        )
    }

    @Test
    fun BasicTest3() {
        assertContentEquals(
            listOf("", ""),
            Solution().anagrams(arrayOf("", ""))
        )
    }
}
