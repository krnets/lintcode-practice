import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "null".toListNode()
        val result = Solution().partition(head, 0)
        val expected = "null"
        assertEquals(expected, listToString(result))
    }

    @Test
    fun BasicTest2() {
        val head = "1->4->3->2->5->2->null".toListNode()
        val result = Solution().partition(head, 3)
        val expected = "1->2->2->4->3->5->null"
        assertEquals(expected, listToString(result))
    }
}
