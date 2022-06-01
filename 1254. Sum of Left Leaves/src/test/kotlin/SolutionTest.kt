import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        val tree = "3,9,20,#,#,15,7"
        val root = constructBinaryTree(tree)
        assertEquals(24, Solution().sumOfLeftLeaves(root))
    }

    @Test
    fun BasicTest2() {
        val tree = "1,#,2,#,3"
        val root = constructBinaryTree(tree)
        assertEquals(0, Solution().sumOfLeftLeaves(root))
    }
}
