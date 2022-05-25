import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "3->2->1->5->null".toListNode()
        assertEquals(1, Solution().nthToLast(head, 2)!!.`val`)
    }

    @Test
    fun BasicTest2() {
        val head = "1->2->3->null".toListNode()
        assertEquals(1, Solution().nthToLast(head, 3)!!.`val`)
    }
}
