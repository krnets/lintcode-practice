import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "1->2->3->3->4->5->3->null".toListNode()
        val actual = listToString(Solution().removeElements(head, 3))
        val expected = "1->2->4->5->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest2() {
        val head = "1->1->null".toListNode()
        val actual = listToString(Solution().removeElements(head, 1))
        val expected = "null"
        assertEquals(expected, actual)
    }
}
