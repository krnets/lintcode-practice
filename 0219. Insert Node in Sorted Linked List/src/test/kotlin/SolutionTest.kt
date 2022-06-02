import org.junit.jupiter.api.Test
import kotlin.test.*

class SolutionTest {

    @Test
    fun BasicTest1() {
        val head = "1->4->6->8->null".toListNode()
        val actual = listToString(Solution().insertNode(head, 5))
        val expected = "1->4->5->6->8->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest2() {
        val head = "1->null".toListNode()
        val actual = listToString(Solution().insertNode(head, 2))
        val expected = "1->2->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest3() {
        val head = "null".toListNode()
        val actual = listToString(Solution().insertNode(head, 1))
        val expected = "1->null"
        assertEquals(expected, actual)
    }

    @Test
    fun BasicTest4() {
        val head = ("20->21->24->26->27->29->29->33->34->36->38->" +
                "42->43->46->50->54->54->58->61->63->67->71->72->73->" +
                "75->76->78->79->81->82->82->84->87->91->95->98->" +
                "102->103->107->109->112->115->116->118->119->119->" +
                "120->123->126->128->130->130->131->135->139->141->" +
                "143->147->150->154->158->null")
            .toListNode()
        val actual = listToString(Solution().insertNode(head, 126))
        val expected = "20->21->24->26->27->29->29->33->34->36->38->" +
                    "42->43->46->50->54->54->58->61->63->67->71->72->73->" +
                    "75->76->78->79->81->82->82->84->87->91->95->98->" +
                    "102->103->107->109->112->115->116->118->119->119->" +
                    "120->123->126->126->128->130->130->131->135->139->141->" +
                    "143->147->150->154->158->null"
        assertEquals(expected, actual)
    }
}
