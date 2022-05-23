import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "1->4->3->2->5->2->null".toListNode()
        val result = "null".toListNode()
        assertEquals(result, Solution().partition(head, 0))
    }

    @Test
    fun BasicTest2() {
        val head = "1->4->3->2->5->2->null".toListNode()
        val result = "1->2->2->4->3->5->null".toListNode()
        assertEquals(result, Solution().partition(head, 3))
    }
}

private fun String.toListNode(): ListNode? {
    val sentinel = ListNode(0)
    var currNode: ListNode? = null
    sentinel.next = currNode

    this.split("->").dropLast(1).map { it.toInt() }.forEach {
        currNode = ListNode(it)
        currNode = currNode!!.next
    }

    return sentinel.next
}
