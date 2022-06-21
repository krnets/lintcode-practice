import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = listOf(1, 2, 3, 4, 5).toLinkedList()
        val actual = listToString(Solution().middleNode(head))
        val expected = "3->4->5->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest2() {
        val head = listOf(1, 2, 3, 4, 5, 6).toLinkedList()
        val actual = listToString(Solution().middleNode(head))
        val expected = "4->5->6->null"
        assertEquals(expected, actual)
    }
}

