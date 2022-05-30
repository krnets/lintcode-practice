import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        assertEquals("0", Solution().addBinary("0", "0"))
        assertEquals("100", Solution().addBinary("11", "1"))
        assertEquals("110", Solution().addBinary("11", "11"))
        assertEquals("110110", Solution().addBinary("100", "110010"))
        assertEquals("10001111010", Solution().addBinary("111001001", "1010110001"))
    }
}
//    100
// 110010
//-------
// 110110
// 110110
