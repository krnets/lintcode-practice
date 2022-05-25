import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "null".toListNode()
        val result = listToString(Solution().deleteDuplicates(head))
        val expected = "null"
        assertEquals(expected, result)
    }

    @Test
    fun BasicTest2() {
        val head = "1->1->2->null".toListNode()
        val after = Solution().deleteDuplicates(head)
        val result = listToString(after)
        val expected = "1->2->null"
        assertEquals(expected, result)
    }

    @Test
    fun BasicTest3() {
        val head = "1->1->2->3->3->null".toListNode()
        val result = listToString(Solution().deleteDuplicates(head))
        val expected = "1->2->3->null"
        assertEquals(expected, result)
    }
}
