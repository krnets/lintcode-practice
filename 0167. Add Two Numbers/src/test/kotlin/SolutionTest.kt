import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val l1head = "7->1->6->null".toListNode()
        val l2head = "5->9->2->null".toListNode()
        val result = listToString(Solution().addLists(l1head, l2head))
        val expected = "2->1->9->null"
        assertEquals(expected, result)
    }

    @Test
    fun BasicTest2() {
        val l1head = "3->1->5->null".toListNode()
        val l2head = "5->9->2->null".toListNode()
        val result = listToString(Solution().addLists(l1head, l2head))
        val expected = "8->0->8->null"
        assertEquals(expected, result)
    }

    @Test
    fun BasicTest3() {
        val l1head = "9->9->null".toListNode()
        val l2head = "9->null".toListNode()
        val result = listToString(Solution().addLists(l1head, l2head))
        val expected = "8->0->1->null"
        assertEquals(expected, result)
    }
}
