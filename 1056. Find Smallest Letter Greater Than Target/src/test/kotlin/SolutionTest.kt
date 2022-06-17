import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        assertEquals('a', Solution().nextGreatestLetter("ab", 'z'))
    }

    @Test
    fun BasicTest2() {
        assertEquals('c', Solution().nextGreatestLetter("cfj", 'a'))
    }

    @Test
    fun BasicTest3() {
        assertEquals('f', Solution().nextGreatestLetter("cfj", 'c'))
    }

    @Test
    fun BasicTest4() {
        assertEquals('f', Solution().nextGreatestLetter("cfj", 'd'))
    }

    @Test
    fun BasicTest5() {
        assertEquals('j', Solution().nextGreatestLetter("cfj", 'g'))
    }

    @Test
    fun BasicTest6() {
        assertEquals('c', Solution().nextGreatestLetter("cfj", 'j'))
    }

    @Test
    fun BasicTest7() {
        assertEquals('c', Solution().nextGreatestLetter("cfj", 'k'))
    }
}
