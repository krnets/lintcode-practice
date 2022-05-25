import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals(978, Solution().hashCode(key = "abcd", hASH_SIZE = 1000))
        assertEquals(78, Solution().hashCode(key = "abcd", hASH_SIZE = 100))
        assertEquals(1673, Solution().hashCode(key = "abcdefghijklmnopqrstuvwxyz", hASH_SIZE = 2607))
        assertEquals(382528955, Solution().hashCode(key = "Wrong answer or accepted?", hASH_SIZE = 1000000007))
    }
}
