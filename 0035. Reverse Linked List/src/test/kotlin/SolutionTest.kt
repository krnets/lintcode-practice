import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        val original = listToString(Solution().reverse(head))
        val expected = "3->2->1->null"

        assertEquals(expected, original)
    }

    @Test
    fun BasicTest2() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        val original = listToString(Solution().reverse(head))
        val expected = "4->3->2->1->null"

        assertEquals(expected, original)
    }

    private fun listToString(head: ListNode?): String {
        var currNode = head
        val sb = StringBuilder()

        while (currNode != null) {
            sb.append(currNode.`val`).append("->")
            currNode = currNode.next
        }
        return sb.append("null").toString()
    }
}
