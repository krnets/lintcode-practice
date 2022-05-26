import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals('b', Solution().firstUniqChar("abaccdeff"))
//        assertEquals('b', Solution().firstUniqChar("aabccd"))
    }
}
