import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTests() {
        var head: ListNode = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)

        var ans = head.next
        assertEquals(ans, Solution().middleNode(head))

        head = ListNode(1)
        head.next = ListNode(2)

        ans = head
        assertEquals(ans, Solution().middleNode(head))
    }
}
