import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        assertEquals(listOf(1, 2, 3), Solution().toArrayList(head))
    }

    @Test
    fun BasicTest2() {
        val head = ListNode(3)
        head.next = ListNode(5)
        head.next!!.next = ListNode(8)
        assertEquals(listOf(3, 5, 8), Solution().toArrayList(head))
    }
}
