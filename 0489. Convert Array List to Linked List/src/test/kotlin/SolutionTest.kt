import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val nums = listOf(1, 2, 3, 4)
        val head = Solution().toLinkedList(nums)
        val actual = listToString(head)
        val expected = "1->2->3->4->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest2() {
        val nums = listOf(1, 2)
        val head = Solution().toLinkedList(nums)
        val actual = listToString(head)
        val expected = "1->2->null"
        assertEquals(expected, actual)
    }
}
