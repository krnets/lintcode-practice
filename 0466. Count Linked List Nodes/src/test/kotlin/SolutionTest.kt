import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = ListNode(1)
        head.next = ListNode(3)
        head.next!!.next = ListNode(5)
        assertEquals(3, Solution().countNodes(head))
    }

    @Test
    fun BasicTest2() {
        val head = null
        assertEquals(0, Solution().countNodes(head))
    }
}
