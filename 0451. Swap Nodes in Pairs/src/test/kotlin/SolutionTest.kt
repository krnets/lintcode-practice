import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "1->2->3->4->null".toListNode()
        val actual = listToString(Solution().swapPairs(head))
        val expected = "2->1->4->3->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest2() {
        val head = "5->null".toListNode()
        val actual = listToString(Solution().swapPairs(head))
        val expected = "5->null"
        assertEquals(expected, actual)
    }
}
