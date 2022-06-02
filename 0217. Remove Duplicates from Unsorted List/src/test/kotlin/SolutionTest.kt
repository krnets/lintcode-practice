import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "1->2->1->3->3->5->6->3->null".toListNode()
        val actual = listToString(Solution().removeDuplicates(head))
        val expected = "1->2->3->5->6->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest2() {
        val head = "2->2->2->2->2->null".toListNode()
        val actual = listToString(Solution().removeDuplicates(head))
        val expected = "2->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest3() {
        val head = "null".toListNode()
        val actual = listToString(Solution().removeDuplicates(head))
        val expected = "null"
        assertEquals(expected, actual)
    }
}
