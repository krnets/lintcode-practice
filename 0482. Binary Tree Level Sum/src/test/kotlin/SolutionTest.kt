import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun BasicTest1() {
        val tree = "1,2,3,4,5,6,7,#,#,8,#,#,#,#,9"
        val root = constructBinaryTree(tree)
        assertEquals(5, Solution().levelSum(root, 2))
    }

    @Test
    fun BasicTest2() {
        val tree = "1,2,3,4,5,6,7,#,#,8,#,#,#,#,9"
        val root = constructBinaryTree(tree)
        assertEquals(22, Solution().levelSum(root, 3))
    }
}
