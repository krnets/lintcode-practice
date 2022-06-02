import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "0->null".toListNode()
        val expected = "0->null"
        assertEquals(expected, listToString(Solution().insertionSortList(head)))
    }

    @Test
    fun BasicTest2() {
        val head = "1->3->2->0->null".toListNode()
        val expected = "0->1->2->3->null"
        assertEquals(expected, listToString(Solution().insertionSortList(head)))
    }
}
