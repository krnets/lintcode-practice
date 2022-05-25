import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val l1head = "null".toListNode()
        val l2head = "0->3->3->null".toListNode()
        val expected = "0->3->3->null"
        assertEquals(expected, listToString(Solution().mergeTwoLists(l1head, l2head)))
    }

    @Test
    fun BasicTest2() {
        val l1head = "1->3->8->11->15->null".toListNode()
        val l2head = "2->null".toListNode()
        val expected = "1->2->3->8->11->15->null"
        assertEquals(expected, listToString(Solution().mergeTwoLists(l1head, l2head)))
    }
}
