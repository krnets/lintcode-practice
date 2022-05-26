import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "1->2->3->4->5->null".toListNode()
        val actual = listToString(Solution().removeNthFromEnd(head, 2))
        val expected = "1->2->3->5->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest2() {
        val head = "5->4->3->2->1->null".toListNode()
        val actual = listToString(Solution().removeNthFromEnd(head, 2))
        val expected = "5->4->3->1->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest3() {
        val head = "1->null".toListNode()
        val actual = listToString(Solution().removeNthFromEnd(head, 1))
        val expected = "null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest4() {
        val head = "1->2->null".toListNode()
        val actual = listToString(Solution().removeNthFromEnd(head, 2))
        val expected = "2->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest5() {
        val head = "0->1->2->3->4->5->6->null".toListNode()
        val actual = listToString(Solution().removeNthFromEnd(head, 5))
        val expected = "0->1->3->4->5->6->null"
        assertEquals(expected, actual)
    }
}
