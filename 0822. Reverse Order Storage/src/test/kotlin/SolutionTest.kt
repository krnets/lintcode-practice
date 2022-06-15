import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = ListNode(1)
        head.next = ListNode(2)
        head.next!!.next = ListNode(3)
        assertContentEquals(listOf(3, 2, 1), Solution().reverseStore(head))
    }

    @Test
    fun BasicTest2() {
        val head = ListNode(4)
        head.next = ListNode(2)
        head.next!!.next = ListNode(1)
        assertContentEquals(listOf(1, 2, 4), Solution().reverseStore(head))
    }
}
