import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "104->101->108->108->111->null".toListNode()
        val actual = listToString(Solution().simplify(head))
        val expected = "104->51->111->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest2() {
        val head =
            "97->98->99->100->101->102->103->104->105->106->107->108->109->110->111->112->113->114->115->116->117->118->119->120->121->122->null".toListNode()
        val actual = listToString(Solution().simplify(head))
        val expected = "97->50->52->122->null"
        assertEquals(expected, actual)
    }
}
