import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val arr = arrayOf("192.168.1.1", "192.118.2.1", "192.168.1.1")
        assertEquals("192.168.1.1", Solution().highestFrequency(arr))
    }

    @Test
    fun BasicTest2() {
        val arr = arrayOf("192.168.1.1", "192.118.2.1", "192.168.1.1", "192.118.2.1", "192.118.2.1")
        assertEquals("192.118.2.1", Solution().highestFrequency(arr))
    }
}
