import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        val head: ListNode = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        var ans = head.next!!.next
        assertEquals(ans, Solution().findNode(head, 3))

        ans = null
        assertEquals(ans, Solution().findNode(head, 4))
    }
}
