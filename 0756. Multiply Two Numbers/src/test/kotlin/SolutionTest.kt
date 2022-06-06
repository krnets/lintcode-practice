import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val l1head = "9->4->6->null".toListNode()
        val l2head = "8->4->null".toListNode()
        assertEquals(79464, Solution().multiplyLists(l1head, l2head))
    }

    @Test
    fun BasicTest2() {
        val l1head = "3->2->1->null".toListNode()
        val l2head = "1->2->null".toListNode()
        assertEquals(3852, Solution().multiplyLists(l1head, l2head))
    }
}
