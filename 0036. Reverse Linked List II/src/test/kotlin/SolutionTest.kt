import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        head.next!!.next!!.next!!.next = ListNode(5)
        val before = listToString(head)
        println(before)
        val after = listToString(Solution().reverseBetween(head, 2, 4))
        val expected = "1->4->3->2->5->null"
        assertEquals(expected, after)
    }

    @Test
    fun BasicTest2() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        head.next!!.next!!.next = ListNode(4)
        val before = listToString(head)
        println(before)
        val after = listToString(Solution().reverseBetween(head, 2, 3))
        val expected = "1->3->2->4->null"
        assertEquals(expected, after)
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
